import java.util.Scanner;
public class Convert_Inches_To_Meters {
	int I;
	float M;
	
	public static float Conv_Ich_Meter(int I)
	
	{
		float M = (float) (I*0.0254);
		return M;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input_Inches = new Scanner (System.in);
		System.out.print("Input a value for inch: ");
		int inches = input_Inches.nextInt();
		float meter = Conv_Ich_Meter(inches);
		System.out.print(inches + " inch is " + meter + " meters");
		
		
	}

}
