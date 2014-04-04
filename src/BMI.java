import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class BMI extends JFrame{
		
	public BMI(){
		
		setLayout(new GridLayout(6, 2 ,5,5));
		// Set GridLayout, 4 rows, 2 columns, and gaps 5 between
	    // components horizontally and vertically
		
		// Add labels and text fields to the frame
		add(new JLabel("Name"));
		add(new JTextField(3));
		add(new JLabel("Age"));
		add(new JTextField(3));
		add(new JLabel("Height"));
		add(new JTextField(3));
		add(new JLabel("Weight"));
		add(new JTextField(3));
		add(new JLabel("BMI"));
		add(new JTextField(3));
		add(new JLabel("Status"));
		add(new JTextField(3));
		add(new JButton("Calculate"));//Add button
		
	}
	    
	/** Main method */
	public static void main(String[] args){
		
		BMI frame = new BMI();
		frame.setTitle("BMI");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);  // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	}

