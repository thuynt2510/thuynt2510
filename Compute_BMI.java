import java.util.Scanner;

public class Compute_BMI {

	//BMI = (Weight in Pounds / (Height in inches x Height in inches)) x 703
	public static float Cal_BMI(float w,float h)
	{
		float BMI = (w/(h*h))*703;
		return BMI;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input_w = new Scanner(System.in);
		Scanner input_h = new Scanner(System.in);
		System.out.print("Input weight in pounds: ");
		float w_pound = input_w.nextFloat();
		System.out.print("Input height in inches: ");
		float h_inches = input_h.nextFloat();
		float BMI = Cal_BMI(w_pound, h_inches);
		System.out.println("Body Mass Index is " + BMI);
		
		
	}

}
