package test;
import java.util.Random;

public class Player{
    private final String userName;
    private int hp;
    private int sp;

    public Player(String userName, int hp, int sp) {
        this.userName = userName;
        this.hp = hp;
        this.sp = sp;
    }

    public String attack(Player enemy) {
        Random rnd = new Random();
        int damage = rnd.nextInt(10) + 1;
        enemy.dealDamage(damage);
        return (getUserName() + " deals " + damage + " to " + enemy.getUserName()) +
        (enemy.getUserName() + " has " + enemy.getHp() + " hit points left!");
    }
    public String useMagic(Player enemy) {
        Random rnd = new Random();
        int damage = rnd.nextInt(21) + 1;
        enemy.dealMagicDamage(damage);
        return (getUserName() + " casts Frizz and deals " + damage + " to " + enemy.getUserName()) +
        (enemy.getUserName() + " has " + enemy.getHp() + " hit points left!");
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
    }
    public void useEther() {
    	sp += 15;
    }

    public boolean isDead() { return hp <= 0; }

    public String getUserName() { return userName; }

    public int getHp() { return hp; }
    
    public int getSp() { return sp; }
}
