import java.util.Scanner;
public class ValidDate {

	public static void main(String[] args) {
		
		System.out.println("Enter date (day/month/year): ");
		Scanner input = new Scanner(System.in);
		Scanner inputLine = new Scanner(input.nextLine());
		
		if (inputLine.hasNextInt())
		{
			int day = inputLine.nextInt();
			int month = inputLine.nextInt();
			int year = inputLine.nextInt();
			
			input.useDelimiter("(\\p{javaWhitespace}|\\/)+");
			
			if (validDate(day, month, year))
			{
				System.out.printf("%d/%d/%d is a valid date.", day, month, year);
			}
			else
			{
				System.out.printf("%d/%d/%d is not a valid date.", day, month, year);
			}
				
		}
		else if (inputLine.hasNext())
		{
			String Line = inputLine.next();
			System.out.println(Line);
		}
		else
		{
			System.out.println("Please type as instructed!");
			input.nextLine();
		}
		input.close();
	}
	
	public static boolean validDate(int day, int month, int year)
	{
		return ((month > 12 || month < 1)?false:
				(day <= daysInMonth(month, year) && day > 0)? true: false);
	}
	
	public static int daysInMonth(int month, int year)
	{
		int days = 31;
		
		
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			days = 30;
		}
		else if (month == 2 && (isLeapYear(year)))
		{
			days = 29;
		}
		else if (month == 2 && (!isLeapYear(year)))
		{
			days = 28;
		}
		return days;
	}
	
	/*
	 * switch (month)
	 * {
	 * 
	 * 	case 2: 
	 * 		numberOfDaysInMonth = isLeapYear(year)?
	 * 		DAYS_IN_FEB_IN_LEAP_YEAR : DAYS_IN_FEB_NORMALLY;
	 * 	  break;
	 * 
	 * 	case 4:
	 * 	case 6:
	 * 	case 9:
	 * 	case 11:
	 * 	numberOfDaysInMonth = DAYS_IN_APRIL_JUNE_SEPT_NOV;
	 * 	  break;
	 * 
	 *  default: 
	 *    numberOfDaysInMonth = DAYS_IN_MOST_MONTHS;
	 *
	 * }
	 */
	
	public static boolean isLeapYear(int year)
	{
		return(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))? 
				true: false);
	}
}
