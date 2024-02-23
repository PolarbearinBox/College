import java.util.Scanner;
public class MonthYear {

	public static void main(String[] args) {
		System.out.println("Enter a month (1-12)");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		System.out.println("Enter a year");
		int year = input.nextInt();
		
		System.out.print("The month has ");
		boolean leapYear = (year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0);
		
		if (leapYear)
		{
			switch(month)
			{
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.print("31");
				break;
			case 2:
				System.out.print("29");
				break;
			default: 
				System.out.print("30");
				break;
			}
		}
		
		
		else 
		{
			switch(month)
			{
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.print("31");
				break;
			case 2:
				System.out.print("28");
				break;
			default: 
				System.out.print("30");
				break;
			}
		}
	
		System.out.print(" days");
		
		input.close();

	}

}
