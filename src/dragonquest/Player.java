public class Player 
{

    private final String userName;
    protected int hp;
    protected int mp;

    public Player(String userName, int hp, int mp) 
    {
        this.userName = userName;
        this.hp = hp;
        this.mp = mp;
    }


    public String getUserName() { return userName; }

    public int getHp() { return hp; }
    
    public int getMp() { return mp; }
    
    public void setHp(int hp) { this.hp = hp; }
    
    public void setMp(int mp) { this.mp = mp; }
}
