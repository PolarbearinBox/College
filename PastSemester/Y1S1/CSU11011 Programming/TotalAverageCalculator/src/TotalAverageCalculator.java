import java.util.Scanner;
public class TotalAverageCalculator {
	public static int MIN_INTERGER = 2;
	public static int MAX_INTERGER = 10;

	public static void main(String[] args) {
		System.out.println("How many integers do you want to enter?");
		Scanner input = new Scanner(System.in);
		double totalNumbers = input.nextDouble();
		int count = 0;
		double sumNumbers = 0;
		
		if (totalNumbers >= MIN_INTERGER && totalNumbers <= MAX_INTERGER)
		{
			for (count = 1; (count <= totalNumbers);count ++)
			{
				System.out.printf("Enter integer %d:%n", count);
				sumNumbers = sumNumbers + input.nextDouble();
			}
			double average = sumNumbers / totalNumbers;
			System.out.printf("The sum of your integers is %.0f and the average is %.2f", sumNumbers, average);
			
		}
		else System.out.println("Error:  This program is constrained "
				+ "to only compute the total & average of between 2 & 10 integers.");
		
		input.close();
	}

}
