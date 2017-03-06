import java.util.Scanner;

public class Sum_integer_digits {
	

	
	
	public static int sum_digits(int inputno)
	{
		int sum =0;
		while (inputno>0)
		{
			sum = sum + inputno%10;
			inputno = inputno/10;	
			
		}
			
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputnum = new Scanner(System.in);
		System.out.print("Input an integer between 0 and 1000: ");
		int I = inputnum.nextInt();
		int sum_no = sum_digits(I);
		System.out.print("The sum of all digits in " + I + " is " + sum_no);
		
		
	}

}
