
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel 
{
	private static final long serialVersionUID = 1L;

	public WelcomePanel() 
	{
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.black);
		
		JLabel label1 = new JLabel("Slime Time!\n" );
		JLabel label2 = new JLabel("Created By: Sean Lovett" );
		
		add(label1);
		add(label2);
	}
}
