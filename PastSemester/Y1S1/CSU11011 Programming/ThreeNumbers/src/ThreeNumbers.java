import java.util.Scanner;
public class ThreeNumbers {
	
	public static void main(String[] args) {
		System.out.println("Please enter your three integers separated by spaces (or enter 'quit'):");
		Scanner input = new Scanner(System.in);
		
		boolean quit = false;
		try 
		{
			do
			{
				if (input.hasNextInt())
				{
					long number1 = input.nextInt();
					long number2 = input.nextInt();
					long number3 = input.nextInt();
					
					System.out.println(getFormattedOutputString(
							medianOf(number1, number2, number3), 
							countOfNumbersGreaterThanTheAverage(number1, number2, number3)
							));
					
					System.out.println("Please enter your three integers separated by spaces (or enter 'quit'):");
						
				}
				else if (input.hasNext("quit"))
				{
					quit = true;
				}
				else
				{
					System.out.println("Please type as specified <3 (uwu) <3");
					input.nextLine();
				}
			}
			while (quit == false);
		}
		catch (Exception exception)
		{
			System.out.println("error");
			input.nextLine();
		}
		input.close();

	}
	
	public static long medianOf (long number1, long number2, long number3)
	{
		long median = number1;
		if (((number1 >= number2) && (number1 <= number3)) 
		  || (number1 >= number3) && (number1 <= number2))
		{
			median = number1;
		}
		else if (((number2 >= number1) && (number2 <= number3))
			   || (number2 <= number1) && (number2 >= number3))
		{
			median = number2;
		}
		else
		{
			median = number3;
		}
		return median;
	}
	
	public static long averageOf (long number1, long number2, long number3)
	{
		return ((number1 + number2 + number3) / 3);
	}
	
	public static int countOfNumbersGreaterThanTheAverage (long number1, long number2, long number3)
	{
		int countOfGreaterThanAverage = 0;
		long average = averageOf(number1, number2, number3);
		if (number1 > average)
		{
			countOfGreaterThanAverage ++;
		}
		
		if (number2 > average)
		{
			countOfGreaterThanAverage ++;
		}
		
		if (number3 > average)
		{
			countOfGreaterThanAverage ++;
		}
		
		return countOfGreaterThanAverage;
	}
	
	public static String getFormattedOutputString (long median, int countOfGreaterThanAverage)
	{
		String formattedOutputString = "The median of your numbers is "
				+ median
				+ ", and "
				+ countOfGreaterThanAverage
				+ " of them"
				+ ((countOfGreaterThanAverage > 1)? " are" :" is")
				+ " greater than their average.";
		return formattedOutputString;
	}

}
