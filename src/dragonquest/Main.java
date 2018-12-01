

import javax.swing.*;

public class Main 
{
	public static void main(String[] args) 
	{
    	JFrame frame = new JFrame("It's time to get slimed!");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	JTabbedPane tp = new JTabbedPane();
    	tp.addTab("Welcome", new WelcomePanel());
    	tp.addTab("Help", new HelpPanel());
    	tp.addTab("Easy", new EasyPanel());
//    	tp.addTab("Medium", new MediumPanel());
    	
    	frame.getContentPane().add(tp);
		frame.pack();
		frame.setVisible(true);
	}
}
