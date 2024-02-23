import java.util.Scanner;

public class ETest6 {
	public static int sumOfCommonDivisors(int number1, int number2)
	{
		int lowerInput = 0;
		int higherInput = 0;
		
		int[] lowerDivisorInitial = new int[0];
		int[] higherDivisorInitial = new int[0];
		int[] commonDivisorInitial = new int[0];
		int[] lowerInputArray = new int [lowerDivisorInitial.length + 1];
		int[] higherInputArray = new int [higherDivisorInitial.length + 1];
		int[] commonDivisorArray = new int [commonDivisorInitial.length + 1];
		
		int sumOfCommonDivisors = 0;
		
		if (number1 < number2)
		{
			lowerInput = number1;
			higherInput = number2;
		}
		else
		{
			lowerInput = number2;
			higherInput = number1;
		}
		
		for (int index = 1; index < lowerInput; index++)
		{
			if (lowerInput % index == 0)
			{
				lowerInputArray = new int [lowerDivisorInitial.length + 1];
				System.arraycopy(lowerDivisorInitial, 0, lowerInputArray, 0, lowerDivisorInitial.length);
				lowerInputArray[lowerInputArray.length - 1] = index;
				lowerDivisorInitial = lowerInputArray;
			}
			
			if (higherInput % index == 0)
			{
				higherInputArray = new int [higherDivisorInitial.length + 1];
				System.arraycopy(higherDivisorInitial, 0, higherInputArray, 0, higherDivisorInitial.length);
				higherInputArray[higherInputArray.length - 1] = index;
				higherDivisorInitial = higherInputArray;
			}
		}
		
		for (int index = 0; index < higherInputArray.length; index++)
		{
			for (int lowerIndex = 0; lowerIndex < lowerInputArray.length; lowerIndex++)
			{
				lowerInputArray[lowerIndex] == 
			}
			{
				commonDivisorArray = new int [commonDivisorInitial.length + 1];
				System.arraycopy(commonDivisorInitial, 0, commonDivisorArray, 0, commonDivisorInitial.length);
				commonDivisorArray[commonDivisorArray.length - 1] = lowerInputArray[index];
				commonDivisorInitial = commonDivisorArray;
			}
		}
		
		for (int index = 0; index < commonDivisorArray.length; index++)
		{
			sumOfCommonDivisors += commonDivisorArray[index];
		}
		
		return sumOfCommonDivisors;
	}
	
	public static int highestDigits(int number1, int number2)
	{
		return 0;
	}
	
	public static int[] getSquaresBetween(int number1, int number2)
	{
		return null;
	}

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		
		System.out.println("Enter any two integers>");
		Scanner input = new Scanner (System.in);
		
		for (int index = 0; index < 2; index++)
		{
			if (input.hasNextInt())
			{
				if(index == 0)
				{
					number1 = input.nextInt();
				}
				else if (index == 1)
				{
					number2 = input.nextInt();
				}
			}
			else
			{
				System.out.println("Error in input. You needed to supply integer values.");
				input.next();
			}
		}
		input.close();
		
		System.out.println(sumOfCommonDivisors(number1, number2) + ": The sum of the common divisors of " 
		+ number1 + " and " + number2);
		System.out.println(highestDigits(number1, number2) + ": The 'highest digits' of " 
				+ number1 + " and " + number2);
		System.out.println(getSquaresBetween(number1, number2) + ": The sum of the common divisors of " 
				+ number1 + " and " + number2);
		
	}

}
