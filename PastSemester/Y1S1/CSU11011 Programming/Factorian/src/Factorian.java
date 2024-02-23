import java.util.Scanner;
public class Factorian {

	public static void main(String[] args) {
		boolean quit = false;
		Scanner input = new Scanner(System.in);
		do 
		{
			System.out.println("Enter number (or 'quit')>");
			if (input.hasNextInt())
			{
				int number = input.nextInt();
				System.out.println("The number "
						+ number
						+ " is "
						+ (isFactorian(number)? "": "not ")
						+"a Factorian.");
			}
			else if (input.hasNext("quit"))
			{
				quit = true;
			}
			else
			{
				input.nextLine();
			}
		}
		while(quit == false);
		

	}
	
	public static int computeFactorial(int number)
	{
		for (int index = number - 1; index >= 1; index--)
		{
			number = number * index;
		}
		return number;
		
	}
	
	public static boolean isFactorian(int number)
	{
		int numberLength = Integer.toString(number).length();
		int sum = 0;
		int digit = 0;
		int digitFactorial = 0;
		int operand = number;
		if (number > 0)
		{
			for (int index = numberLength; index > 0; index--)
			{
				digit = operand / (int)(Math.pow(10, index - 1));
				digitFactorial = computeFactorial(digit);
				sum = sum + digitFactorial;
				operand = operand - digit * (int)(Math.pow(10, index - 1));
			}
			return((number == sum)?true: false);
		}
		else
		{
			return false;
		}
		
	}

}
