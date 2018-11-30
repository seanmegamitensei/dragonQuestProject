package test;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Player{
	Player Hero = new Player("Hero", 50, 20);
    Player Slime = new Player("Slime", 50, 20);
    private final String userName;
    private int hp;
    private int mp;

    public Player(String userName, int hp, int mp) {
        this.userName = userName;
        this.hp = hp;
        this.mp = mp;
    }

    public void attack(Player Slime) {
        Random rnd = new Random();
        int damage = rnd.nextInt(10) + 1;
        Slime.dealDamage(damage);
        System.out.println((getUserName() + " deals " + damage + " to " + Slime.getUserName()) +
        (Slime.getUserName() + " has " + Slime.getHp() + " hit points left!"));
    }
    public void useMagic(Player Slime) {
        Random rnd = new Random();
        int damage = rnd.nextInt(21) + 10;
        Slime.dealMagicDamage(damage);
        System.out.println ((getUserName() + " casts Frizz and deals " + damage + " to " + Slime.getUserName()) +
        (Slime.getUserName() + " has " + Slime.getHp() + " hit points left!"));
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
    	if (mp >= 5) {
    		if (hp < 0) {
    			hp = 0;
    			mp -= 5;
    		}
    		else {
    			hp = hp;
    			mp -= 5;
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
    	mp += 15;
    	System.out.println("You used an ether!\n)"
    			+ "Your MP is now: " + mp);
    }


    public boolean isDead() { return hp <= 0; }

    public String getUserName() { return userName; }

    public int getHp() { return hp; }
    
    public int getMp() { return mp; }
    
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
            Hero.usePotion();
        }
        if(e.getSource() == button4){
            Hero.useEther();
        }
}
}
