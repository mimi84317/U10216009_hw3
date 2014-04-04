import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class BMI_2 extends JFrame{
	// Create text fields for BMI
	
	private JTextField jtfName = new JTextField();
	private JTextField jtfAge = new JTextField();
	private JTextField jtfHeight = new JTextField();
	private JTextField jtfWeight = new JTextField();
	private JTextField jtfBMI = new JTextField();
	
	// Create a Compute BMI button
	public JButton jbtCalculate = new JButton("Calculate");
	
	public BMI_2(){
		
		// Panel p1 to hold labels and text fields
		JPanel p1 = new JPanel(new GridLayout(5, 2));
		p1.add(new JLabel("Name"));
		p1.add(jtfName);
		p1.add(new JLabel("Age"));
		p1.add(jtfAge);
		p1.add(new JLabel("Height(m)"));
		p1.add(jtfHeight);
		p1.add(new JLabel("Weight"));
		p1.add(jtfWeight);
		p1.add(new JLabel("BMI"));
		p1.add(jtfBMI);
		p1.setBorder(new TitledBorder("Enter name, age, height, and weight."));
		
		// Panel p2 to hold the button
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbtCalculate);
		
		// Add the panels to the frame
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		// Register listener
		jbtCalculate.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener{
		/** Handle the Compute Payment button */
		
		@Override
		public void actionPerformed(ActionEvent e){
			// Get values from text fields
			
			double height = Double.parseDouble(jtfHeight.getText());
			double weight = Double.parseDouble(jtfWeight.getText());
			double bmi = weight / (Math.pow(height, 2));
			
			// Display BMI 
			jtfBMI.setText(String.format("%.2f", bmi ));
			
			
		}
		
		
	}
	
	public static void main(String[] args){
		BMI_2 frame = new BMI_2();
		frame.pack();
		frame.setTitle("BMI");
		frame.setLocationRelativeTo(null);// Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

	
	
	

}
