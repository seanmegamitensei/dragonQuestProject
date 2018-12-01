
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Random;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.*;

public class BattlePanel extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
   
	public BattlePanel() 
	{
		new JFXPanel();
		String bip = "music.wav";
		Media hit = new Media(new File(bip).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
		Player hero = new Player("Hero", 50, 20);
	    Player slime = new Player("Slime", 50, 20);
		setPreferredSize(new Dimension(500, 700));
	    setBackground(Color.black);
	    
		JLabel hpmp = new JLabel("HP: " + hero.getHp() + " MP: " + hero.getMp());
		hpmp.setFont(new Font("Serif", Font.PLAIN, 25));
		hpmp.setForeground (Color.white);
		JLabel space = new JLabel("<html><br></html>");
	    JLabel slimeLabel = new JLabel();
		slimeLabel.setIcon(new ImageIcon("slime.png"));
		JButton attack = new JButton("Attack");
		JButton magic = new JButton("Magic");
		JButton potion = new JButton("Potion");
		JButton ether = new JButton("Ether");
		JLabel label1 = new JLabel("A blue slime draws near!");
		label1.setFont(new Font("Serif", Font.PLAIN, 20));
		label1.setForeground (Color.white);
	    
		
		attack.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        Random rnd = new Random();
		        int damage = rnd.nextInt(10) + 1;
		        slime.hp -= damage;
		        hpmp.setText("HP: " + hero.getHp() + " MP: " + hero.getMp());
		        label1.setText("You dealt " + damage + " to the blue slime!" +
		        		" Slime now has " + slime.hp + " health!");
		    }
		});
		magic.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {	
		    	if (hero.mp >= 4) {
		    		Random rnd = new Random();
		    		int damage = rnd.nextInt(20) + 1;
		    		slime.hp -= damage;
		    		hero.setMp(hero.mp -= 4);
		    		hpmp.setText("HP: " + hero.getHp() + " MP: " + hero.getMp());
		    		label1.setText("You dealt " + damage + " to the blue slime!" +
		        		" Slime now has " + slime.hp + " health!");
		    	}
		    	else
		    		label1.setText("You don't have enough MP!");
		    }
		});
		potion.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        hero.setHp(hero.hp += 15);
		        hero.getHp();
		        hpmp.setText("HP: " + hero.getHp() + " MP: " + hero.getMp());
		        label1.setText("You used a potion!" +
		        		" You now have " + hero.getHp() + " health!");
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
		add(hpmp);
		add(slimeLabel);
	    add(attack);
	    add(magic);
	    add(potion);
	    add(ether);
	    add(space);
	    add(label1);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
