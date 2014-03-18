import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

import java.awt.*;

import javax.swing.*;

public class BMI extends Frame{
	
	public TestPanels() {
	    // Create panel p1 for the buttons and set GridLayout
	    JPanel p1 = new JPanel();
	    p1.setLayout(new GridLayout(4, 3));

	    // Add buttons to the panel
	    for (int i = 1; i <= 9; i++) {
	      p1.add(new JButton("" + i));
	    }
	
	
	
	frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
    
    add(new JLabel("First Name"));
    add(new JTextField(8));
    add(new JLabel("MI"));
    add(new JTextField(1));
    add(new JLabel("Last Name"));
    add(new JTextField(8));
}
