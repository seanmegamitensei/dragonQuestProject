
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel 
{
	private static final long serialVersionUID = 1L;

	public WelcomePanel() 
	{
		setPreferredSize(new Dimension(500, 700));
		setBackground(Color.black);
		
		JLabel label1 = new JLabel("Slime Time!" );
		label1.setForeground (Color.white);
		label1.setFont(new Font("Serif", Font.PLAIN, 25));
		JLabel label2 = new JLabel("Created By: Sean Lovett" );
		label2.setForeground (Color.white);
		label2.setFont(new Font("Serif", Font.PLAIN, 40));
		JLabel slimeLabel = new JLabel();
		slimeLabel.setIcon(new ImageIcon("slime.png"));
		
		add(label1);
		add(slimeLabel);
		add(label2);
		
	}
}
