import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class BMI extends Frame{
		
		private JTextField jtfHeight = new JTextField();
		private JTextField jtfWeight = new JTextField();
		private JTextField jtfBMI = new JTextField();
			
		private JButton jbtCalculate = new JButton("Calculate");
		
	public BMI(){
		JPanel p1 = new JPanel(new GridLayout(3 , 2));
		p1.add(new Label("Height"));
		p1.add(jtfHeight);
		p1.add(new Label("Weight"));
		p1.add(jtfWeight);
		p1.add(new Label("BMI"));
		p1.add(jtfBMI);
		p1.setBorder(new TitledBorder("Enter your height and weight"));
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		
	}	
	

	public static void main(String[] args){
		
		
	}
	}

