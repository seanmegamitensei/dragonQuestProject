
import java.awt.*;
import javax.swing.*;

public class HelpPanel extends JPanel
{
	private static final long serialVersionUID = 1L;

	public HelpPanel() 
	{
		setPreferredSize(new Dimension(525, 700));
		setBackground(Color.black);
		
		JLabel label1 = new JLabel("Attack: deals regular damage" );
		JLabel label2 = new JLabel("Magic: casts Frizz, deals more damage than "
				+ "Attack but requires 5 MP");
		JLabel label3 = new JLabel("Potion: restores 15 HP (Health Points)");
		JLabel label4 = new JLabel("Ether: restores 15 MP (Magic Points)");
		JLabel label5 = new JLabel("Reset: Restarts the encounter");
		label1.setForeground (Color.white);
		label1.setFont(new Font("Serif", Font.PLAIN, 40));
		label2.setForeground (Color.white);
		label2.setFont(new Font("Serif", Font.PLAIN, 15));
		label3.setForeground (Color.white);
		label3.setFont(new Font("Serif", Font.PLAIN, 30));
		label4.setForeground (Color.white);
		label4.setFont(new Font("Serif", Font.PLAIN, 30));
		label5.setForeground (Color.white);
		label5.setFont(new Font("Serif", Font.PLAIN, 40));
		
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
	}
}
