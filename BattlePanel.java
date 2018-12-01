package test;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

import javax.swing.*;

public class BattlePanel extends JPanel {

	Player Hero = new Player("Hero", 50, 20);
    Player Slime = new Player("Slime", 50, 20);
	private JLabel label1;
	private JButton button1, button2, button3, button4;
   
	public BattlePanel() {
		setPreferredSize(new Dimension(300, 75));
	    setBackground(Color.black);
	    
		JLabel label1 = new JLabel("A blue slime draws near!");
		JButton button1 = new JButton("Attack");
		JButton button2 = new JButton("Magic");
		JButton button3 = new JButton("Potion");
		JButton button4 = new JButton("Ether");

	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    button3.addActionListener(this);
	    button4.addActionListener(this);
	    
	    add(label1);
	    add(button1);
	    add(button2);
	    add(button3);
	    add(button4);
	    pack();
	    setVisible(true);
	   
	}
}
