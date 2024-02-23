import java.util.Scanner;
public class PercentageToGradeConverter {

	public static void main(String[] args) {
		final double MAX = 100.0;
		final double I = 69.5;
		final double II_1 = 59.5;
		final double II_2 = 49.5;
		final double III = 39.5;
		final double F1= 34.5;
		final double F2 = 0.0;
		
		String quit = "";
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter a percentage (or 'quit' to finish)>");
			if(input.hasNextDouble())
			{
				double percentage = input.nextDouble();	
				
				if (percentage >= I && percentage <= MAX)
				{
					System.out.println("The grade for " + percentage + "% is a I ");
				}
				else if (percentage >= II_1 && percentage <= MAX)
				{
					System.out.println("The grade for " + percentage + "% is a II.1 ");
				}
				else if (percentage >= II_2 && percentage <= MAX)
				{
					System.out.println("The grade for " + percentage + "% is a II.2 ");
				}
				else if (percentage >= III && percentage <= MAX)
				{
					System.out.println("The grade for " + percentage + "% is a III ");
				}
				else if (percentage >= F1 && percentage <= MAX)
				{
					System.out.println("The grade for " + percentage + "% is an F1 ");
				}
				else if (percentage >= F2 && percentage <= MAX)
				{
					System.out.println("The grade for " + percentage + "% is an F2 ");
				}
				else
				{
					System.out.println("Error: Percentages must be between 0.0% and 100.0% ");
				}
				
				}
			else if (input.hasNext("quit"))
			{
				quit = input.next();
			}
			else if (input.hasNext())
			{
				System.out.println("Error: Enter a number between 0.0 and 100.0, or the word quit to exit the program.");
				input.nextLine();
			}
			else
			{
				System.out.println("You must type something");
				input.nextLine();
			}
			
		}
		while(!quit.equalsIgnoreCase("quit"));
		input.close();
	}
			
}
