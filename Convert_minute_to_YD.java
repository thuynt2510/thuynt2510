import java.util.Scanner;




public class Convert_minute_to_YD {


public static int Covert_To_Years(int m)

{
	int minutesInAYear = 60*24*365;
	int Year = m/minutesInAYear;

	
      return Year;
   
      
}
public static int Covert_To_Days(int m)
{
	int day = (m/60/24)%365;
	return day;
}


	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input the number of minutes: ");
		
		int input_minute = input.nextInt();
		int result_Y = Covert_To_Years(input_minute);
		int result_D = Covert_To_Days(input_minute);
		
		System.out.print( input_minute + " minutes is approximately " + result_Y +" years and " + result_D + " days");
		
	}

}
