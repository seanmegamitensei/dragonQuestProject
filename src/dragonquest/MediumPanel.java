
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Random;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.*;

public class MediumPanel extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
   
	public MediumPanel() 
	{
		new JFXPanel();
		String bip = "music.wav";
		Media hit = new Media(new File(bip).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
		Player hero = new Player("Hero", 50, 20);
	    Player cruelcumber = new Player("Cruelcumber", 75, 20);
		setPreferredSize(new Dimension(525, 700));
	    setBackground(Color.black);
	    
		JLabel hpmp = new JLabel("HP: " + hero.getHp() + " MP: " + hero.getMp());
		hpmp.setFont(new Font("Serif", Font.PLAIN, 25));
		hpmp.setForeground (Color.white);
		JLabel space = new JLabel("<html><br></html>");
	    JLabel enemyImage = new JLabel();
		enemyImage.setIcon(new ImageIcon("cruelcumber.png"));
		JButton attack = new JButton("Attack");
		JButton magic = new JButton("Magic");
		JButton potion = new JButton("Potion");
		JButton ether = new JButton("Ether");
		JButton reset = new JButton("Reset");
		JLabel label1 = new JLabel("A cruelcumber draws near! Command?");
		label1.setFont(new Font("Serif", Font.PLAIN, 20));
		label1.setForeground (Color.white);
	    
		
		attack.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	Random rnd = new Random();
			    int damage = rnd.nextInt(10) + 1;
			    
		    	if (hero.getHp() >= 0 && cruelcumber.getHp() >= 0) { 
		    	cruelcumber.hp -= damage;
		        hpmp.setText("HP: " + hero.getHp() + " MP: " + hero.getMp());
		        label1.setText("You dealt " + damage + " to the cruelcumber!" +
		        		" Cruelcumber now has " + cruelcumber.hp + " health!");
		    	}
		    	if (hero.getHp() <= 0) {
		        	label1.setText("You have fainted!!!"); }
		        if (cruelcumber.getHp() <= 0) {
		        	label1.setText("You landed a finishing blow for " + damage + "! The cruelcumber has fainted!!!"); }
		        
//		        if (hero.getHp() >= 0 && slime.getHp() >= 0) { 
//				Random rnd = new Random();
//				int damage = rnd.nextInt(10) + 1;
//				hero.hp -= damage;
//				hpmp.setText("HP: " + hero.getHp() + " MP: " + hero.getMp());
//				label1.setText("The blue slime dealt " + damage + " to you!");
//		        }
//		        else if (hero.getHp() <= 0) {
//		        	label1.setText("You have fainted!!!"); }
		    }
		});
		magic.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e) {
			Random rnd = new Random();
    		int damage = rnd.nextInt(20) + 1;
		    {	if (hero.getHp() >= 0 && cruelcumber.getHp() >= 0) { 
		    	if (hero.mp >= 4) {
		    		cruelcumber.hp -= damage;
		    		hero.setMp(hero.mp -= 4);
		    		hpmp.setText("HP: " + hero.getHp() + " MP: " + hero.getMp());
		    		label1.setText("You dealt " + damage + " to the cruelcumber!" +
		        		" Cruelcumber now has " + cruelcumber.hp + " health!");
		    	}
		    	else
			        label1.setText("You don't have enough MP!");
		    	}
		    if (hero.getHp() <= 0) {
	        	label1.setText("You have fainted!!!"); }
	        if (cruelcumber.getHp() <= 0) {
	        	label1.setText("You landed a finishing blow for " + damage + "! The cruelcumber has fainted!!!"); }
		    }
		    	
		    }
		   
		});
		potion.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	if (hero.getHp() >= 0) {
		        hero.setHp(hero.hp += 15);
		        hero.getHp();
		        hpmp.setText("HP: " + hero.getHp() + " MP: " + hero.getMp());
		        label1.setText("You used a potion!" +
		        		" You now have " + hero.getHp() + " health!");
		    	}
		    	else
		    		label1.setText("You are already dead!");
		    }
		});
		ether.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        hero.setMp(hero.mp += 15);
		        hpmp.setText("HP: " + hero.getHp() + " MP: " + hero.getMp());
		        label1.setText("You used an ether!" +
		        		" You now have " + hero.getMp() + " magic points!");
		    }
		});
		reset.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	hero.setHp(50);
		    	hero.setMp(20);
		    	cruelcumber.setHp(75);
		    	cruelcumber.setMp(20);
			    label1.setText("The blue slime draws near! Command?");
		    }
		});
		add(hpmp);
		add(enemyImage);
	    add(attack);
	    add(magic);
	    add(potion);
	    add(ether);
	    add(reset);
	    add(space);
	    add(label1);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
