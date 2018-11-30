package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.*;

public class BattlePanel extends JPanel {

	Player Hero = new Player("Hero", 50, 20);
    Player Slime = new Player("Slime", 50, 20);
	private JLabel label1;
	private JButton button1, button2, button3, button4;
    private final String userName;
    private int hp;
    private int sp;

    public BattlePanel(String userName, int hp, int sp) {
        this.userName = userName;
        this.hp = hp;
        this.sp = sp;
    }

    public String attack(Player Slime) {
        Random rnd = new Random();
        int damage = rnd.nextInt(10) + 1;
        Slime.dealDamage(damage);
        return (getUserName() + " deals " + damage + " to " + Slime.getUserName()) +
        (Slime.getUserName() + " has " + Slime.getHp() + " hit points left!");
    }
    public String useMagic(Player Slime) {
        Random rnd = new Random();
        int damage = rnd.nextInt(21) + 10;
        Slime.dealMagicDamage(damage);
        return (getUserName() + " casts Frizz and deals " + damage + " to " + Slime.getUserName()) +
        (Slime.getUserName() + " has " + Slime.getHp() + " hit points left!");
    }

    public void dealDamage(int damage) {
        hp -= damage;
        if (hp < 0)
        	hp = 0;
        else
        	hp = hp;
    }
    public void dealMagicDamage(int damage) {
    	hp -= damage;
    	if (sp >= 5) {
    		if (hp < 0) {
    			hp = 0;
    			sp -= 5;
    		}
    		else {
    			hp = hp;
    			sp -= 5;
    		}
    }
    }
    public void usePotion() {
    	hp += 15;
    	System.out.println("You used a potion!\n)"
    			+ "Your HP is now: " + hp + "\n" +
    			"You feel invigorated!");
    }
    public void useEther() {
    	sp += 15;
    	System.out.println("You used an ether!\n)"
    			+ "Your SP is now: " + sp);
    }

    public boolean isDead() { return hp <= 0; }

    public String getUserName() { return userName; }

    public int getHp() { return hp; }
    
    public int getSp() { return sp; }
	
	public BattlePanel() {
		setPreferredSize(new Dimension(300, 75));
	    setBackground(Color.black);
	    
		JLabel label1 = new JLabel("A blue slime draws near!");
		JButton button1 = new JButton("Attack");
		JButton button2 = new JButton("Magic");
		JButton button3 = new JButton("Potion");
		JButton button4 = new JButton("Ether");

	    button1.addActionListener(new dealDamage());
	    button2.addActionListener(new DealMagicDamage());
	    button3.addActionListener(new usePotion());
	    button4.addActionListener(new useEther());
	    
	    add(label1);
	    add(button1);
	    add(button2);
	    add(button3);
	    add(button4);
	   
	    
	    public void actionPerformed(ActionEvent e)
        {
            //Execute when button is pressed

            if(e.getSource() == button1){
                System.out.println(Hero.attack());
                Hero.dealDamage();
            }
            if(e.getSource() == button2){
                System.out.println(Hero.useMagic());
                Hero.dealMagicDamage();
            }
            if(e.getSource() == button3){
                System.out.println(Hero.useMagic());
                Hero.dealMagicDamage();
            }
	}
	}
}