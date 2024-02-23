import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		System.out.println("Enter your list of numbers separated by spaces:");
		Scanner input = new Scanner(System.in);
		Scanner inputLine = new Scanner(input.nextLine());
		
		
		double initial = inputLine.nextDouble();
		double min = initial;
		double max = initial;
		
		while(inputLine.hasNextDouble())
		{
			double next = inputLine.nextDouble();
			if (min > next)
			{
				min = next;
			}
			else if(max < next)
			{
				max = next;
			}
		}
		inputLine.close();
		input.close();
		
		System.out.println("The numbers you entered are between " + min + " and " + max);

	}

}
