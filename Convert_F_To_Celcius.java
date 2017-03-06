//Scanner class allow to enter characters from keyboards
import java.util.Scanner;

public class Convert_F_To_Celcius {
	static float F;
	float C;

	/*create static method Conv_F_To_C
    A static method belongs to the class rather than object of a class.
    A static method can be invoked without the need for creating an instance of a class.
    static method can access static data member and can change the value of it.*/

	public static float Conv_F_To_C (float F)
	
	{
		float C = (F  -  32)*5/9;
		return C;
		
	}
	public static void main(String[] args) {
	
		// create new object from Scanner class. 
		Scanner inputF = new Scanner(System.in);
		System.out.print("Input a degree in Fahrenheit: ");
		float temp_F = inputF.nextFloat();
		float temp_C = Conv_F_To_C(temp_F);
		System.out.println(temp_F + " degree Fahrenheit is equal to "+ temp_C+" in Celsius");
		

	}

	}


