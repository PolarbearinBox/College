import java.util.Scanner;
public class PrimePair {

	public static void main(String[] args) {
		System.out.println("Entre a number");
		Scanner input = new Scanner(System.in);
		
		
		int number = input.nextInt(); // R1 = number
		int primePair = 0;			  // R0 = primePair
		int divisor = 1;			  // R2 = divisor
		int count = number;			  // R3 = count
		int remainder = 1;			  // R4 = remainder
		int prime = 0;				  // R5 = prime
		
		for (count = number; (count > 2); count--)
		{
			for (divisor = 2, remainder = count % divisor; (remainder != 0); divisor++)
			{
				remainder = count % divisor;
			}
			divisor -= 1;
			if (divisor == count)
			{
				if (prime - count == 2)
				{
					primePair += 1;
					prime = count;
				}
				else
				{
					prime = count;
				}
			}
		}
		System.out.println("The number of prime pairs is " + primePair);
		input.close();
	}

}
