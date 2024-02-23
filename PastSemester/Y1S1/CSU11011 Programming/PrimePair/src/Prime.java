import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int divisor = 2;
		
		int remainder = number % divisor;
		
		for (divisor = 2; (remainder != 0); divisor += 1)
		{
			remainder = number % divisor;	
		}
		divisor = divisor -  1;
		if (divisor == number)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		input.close();
	}
	
}
