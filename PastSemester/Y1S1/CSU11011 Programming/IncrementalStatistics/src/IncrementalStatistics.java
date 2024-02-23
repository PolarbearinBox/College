import java.util.Scanner;
public class IncrementalStatistics {

	public static void main(String[] args) {
		System.out.println("This program computes the average and variance of all numbers entered.");
		double variance = 0;
		double count = 1;
		boolean exit = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number (or type 'exit'):");
		
		do 
		{
		if (input.hasNextDouble())
			{
				double number = input.nextDouble();
				double average = number;
				average = average + ((number - average) / count);
			
				if (count == 1)
				{
					variance = 0;
				}
				else 
				{
					variance = varianceCalculator(count, average, number, variance);
				}
				
				count += 1;
				
				System.out.printf("So far the average is %.1f and the variance is %.1f"
						, average, variance);
				System.out.println();
				System.out.println("Enter another number (or type 'exit'):");
			}
			else if (input.hasNext("exit"))
			{
				exit = true;
			}
			else
			{
				System.out.println("You must enter a number to continue, or type 'exit' to quit the program.");
				input.nextLine();
			}
		}
	while(!exit);
		
	System.out.println("Goodbye.");
	input.close();
	}


	public static double varianceCalculator(double count, double average, double number, double lastVariance)
	{
		double variance = ((count - 1) * (lastVariance)
				+ (number - (count * average - number)/(count - 1))
				* (number - average))
				/ (count);
		
		return variance;
	}
	
}