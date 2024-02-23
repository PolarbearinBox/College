import java.util.Scanner;
public class Vertebrates {

	public static void main(String[] args) {
		System.out.println("Is the animal cold blooded (Yes/No)?");
		Scanner input = new Scanner(System.in);
		String isColdBloodedAnswer = input.next();
		boolean isColdBlooded = isColdBloodedAnswer.equalsIgnoreCase("Yes");
		
		if (isColdBlooded)
		{
			System.out.println("Does the animal have scales (Yes/No)?");
			String hasScalesAnswer = input.next();
			boolean hasScales = hasScalesAnswer.equalsIgnoreCase("Yes");
			
			if (hasScales)
			{
				System.out.println("Does the animal have any fins (Yes/No)?");
				String hasFinsAnswer = input.next();
				boolean hasFins = hasFinsAnswer.equalsIgnoreCase("Yes");
				{
					if (hasFins)
					System.out.println("The animal is a fish.");
					else 
					System.out.println("The animal is a reptile.");
				}
			}
			else 
			System.out.println("The animal is an amphibian.");
				
		}
		else 
			{
				System.out.println("Does the animal have feathers (Yes/No)?");
				String hasFeathersAnswer = input.next();
				boolean hasFeathers = hasFeathersAnswer.equalsIgnoreCase("Yes");
				
				if (hasFeathers)
				{
					System.out.println("The animal is a bird.");
				}
				else
					System.out.println("The animal is a mammal.");
			}
		
	input.close();
	}

}
