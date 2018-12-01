package test;

import javax.swing.*;

public class Main 
{
	public static void main(String[] args) 
	{
    	JFrame frame = new JFrame("DragonQuest Random Encounter");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	JTabbedPane tp = new JTabbedPane();
    	tp.addTab("Welcome", new WelcomePanel());
    	tp.addTab("Help", new HelpPanel());
    	tp.addTab("Battle", new BattlePanel());
    	
    	frame.getContentPane().add(tp);
		frame.pack();
		frame.setVisible(true);
	}
}
