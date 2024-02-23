import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		System.out.println("Enter your number: ");
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt())
		{
			int number = input.nextInt();
			if (number >= 1)
			{
				System.out.println("Enter the limit: ");
				int limit = input.nextInt();
				int ordinalNumber = limit / number;
				System.out.printf("The multiples of %d (up to %d) are ", number, limit);
				int result = number;
				for (int count = 0; (count < ordinalNumber); count++)
				{
					result = number * count;
					System.out.print(result + ", ");
				}
				System.out.print(number * ordinalNumber);
			}
			else 
			{
				System.out.println("Enter a positive number");
			}
		}
		else 
		{
			System.out.println("Enter a number");
		}
		input.close();
	}

}
