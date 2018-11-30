package test;

import java.awt.*;
import javax.swing.*;

public class WelcomePanel extends JPanel{
	public WelcomePanel() {
		setPreferredSize(new Dimension(300, 75));
	    setBackground(Color.black);
	    
	    JLabel label1 = new JLabel("Slime Time!\n" );
	    JLabel label2 = new JLabel("Created By: Sean Lovett" );
	    
	    add(label1);
	    add(label2);
	}

}
