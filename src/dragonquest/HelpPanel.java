package dragonquest;

import java.awt.*;
import javax.swing.*;

public class HelpPanel extends JPanel
{
	public HelpPanel() 
	{
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.black);
		
		JLabel label1 = new JLabel("Attack: deals regular damage\n" );
		JLabel label2 = new JLabel("Magic: casts Frizz, deals potentially more damage than "
				+ "Attack but requires 5 SP\n");
		JLabel label3 = new JLabel("Potion: restores 15 HP\n");
		JLabel label4 = new JLabel("Ether: restores 15 HP");
		
		add(label1);
		add(label2);
		add(label3);
		add(label4);
	}
}
