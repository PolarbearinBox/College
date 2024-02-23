import java.util.Scanner;

public class ETest5 {
	public static int DECIMAL = 10;
	
	public static int nearestFactorialNumber( int number )
	// ZeroInput
	{
		int localNumber = Math.abs(number);
		int factorialEnd = 0;
		int factorial = 1;
		int largerFactorial = 0;
		
		if (localNumber == 0)
		{
			return -1;
		}
		else
		{
			for (int index = 2; localNumber > 1 ; index++)
			{
				localNumber = localNumber / index;
				factorialEnd = index;
			}
			
			for (int index = factorialEnd; index > 1; index--)
			{
				factorial *= index;
			}
			
			largerFactorial = factorial * (factorialEnd + 1);
			
			return (largerFactorial - localNumber == localNumber - factorial)? largerFactorial: factorial;
		}
	}
	
	public static int sumOfNonTrivialDivisors( int number )
	{
		int localNumber = Math.abs(number);
		int sumOfNonTrivialDivisors = 0;
		
		if (localNumber > 0)
		{
			return -1;
		}
		else
		{
			for (int nonTrivialDivisor = 2; nonTrivialDivisor < localNumber; nonTrivialDivisor ++ )
			{
				if(localNumber % nonTrivialDivisor == 0)
				{
					sumOfNonTrivialDivisors += nonTrivialDivisor;
				}
			}
			return sumOfNonTrivialDivisors;
		}
	}
	 
	public static int numberOfEvenDigits (int number)
	// negativeInput,ZeroInput, LargeInput
	{
		int localNumber = Math.abs(number);
		int digits = 0;
		int evenDigits = 0;
		int remainder = 0;
		int returnValue = -1;
		
		if (localNumber >= 0)
		{
			do
			{
				remainder = localNumber % DECIMAL;
				localNumber = localNumber / DECIMAL;
				if ( remainder % 2 == 0 )
				{
					evenDigits ++;
				}
				digits++;
			}
			while(localNumber != 0);
			returnValue = evenDigits;
		}
		return returnValue;
	
	}
	
	public static int applyWeirdUnaryMathsOperator(char operator, int number )
	{
		int returnValue = -1;
		if (number == 0)
		{
			return -1;
		}
		else
		{
			char localOperator = operator;
			int localNumber = number;
			int digits = 0;
			
			switch (localOperator)
			{
			case '#': 
				returnValue = sumOfNonTrivialDivisors(localNumber);
				break;
			case 'F':
				returnValue = nearestFactorialNumber(localNumber);
				break;
			case 'E':
				returnValue = numberOfEvenDigits(localNumber);
				break;
			case'O':
				int evenDigits = numberOfEvenDigits(localNumber);
				for ( digits = 0; localNumber != 0; digits++)
				{
					localNumber = localNumber / DECIMAL;
				}
				returnValue = (digits - evenDigits);
				break;
			default:
				returnValue = -1;
				break;
			}
		}
		return returnValue;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nextString = "";
		char operator = 'a';
		int number = 0;
		int answer = 0;
		
		System.out.println("Enter a weird maths operator (# F E O) and one integer>");
		
		nextString = input.next();
		operator = nextString.charAt(0);
		number = input.nextInt();
		input.close();
		answer = applyWeirdUnaryMathsOperator( operator,  number );

		System.out.println( (answer == -1) ? "Error: Could not apply weird maths operator as entered." :
				"Answer: " + operator + " applied to " + number + " gives " + answer);

	}

}