package test;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Main extends Player{

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	JFrame frame = new JFrame("DragonQuest Random Encounter");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	JTabbedPane tp = new JTabbedPane();
    	tp.addTab("Welcome", new WelcomePanel());
    	tp.addTab("Help", new HelpPanel());
    	tp.addTab("Battle", new BattlePanel());
    	
    	frame.getContentPane().add(tp);
        frame.pack();
        frame.setVisible(true);
    	
        System.out.println("Please enter your Hero's Name: ");
        String userName = scan.nextLine();

        Player Hero = new Player(userName, 50, 20);
        Player Slime = new Player("Slime", 50, 20);

        Game game = new Game(Hero, Slime);
        game.fight();
    }
}