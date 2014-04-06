
public class UseBMIClass {
	  private int age;
	  private double weight; // in pounds
	  private double height; // in inches
	  public static final double KILOGRAMS_PER_POUND = 0.45359237; 
	  public static final double METERS_PER_INCH = 0.0254;  
	  
	  public UseBMIClass(int age, double weight, double height) {
	    
	    this.age = age;
	    this.weight = weight;
	    this.height = height;
	  }
	  
	  public UseBMIClass( double weight, double height) {
	    this( 20, weight, height);
	  }
	  
	  public double getBMI() {
	    double bmi = weight  / ((height) * (height ));
	    return Math.round(bmi * 100) / 100.0;
	  }
	  
	  public String getStatus() {
	    double bmi = getBMI();
	    if (bmi < 18.5)
	      return "Underweight";
	    else if (bmi < 24)
	      return "Normal";
	    else if (bmi < 30)
	      return "Overweight";
	    else
	      return "Obese";
	  }
	  
	 
	  
	  public int getAge() {
	    return age;
	  }
	  
	  public double getWeight() {
	    return weight;
	  }
	  
	  public double getHeight() {
	    return height;
	  }
}
