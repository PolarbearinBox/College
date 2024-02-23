import java.util.Scanner;
public class PassOrFail {

	public static void main(String[] args) {
		System.out.println("What is your exam percentage?");
		Scanner input = new Scanner (System.in);
		int examPercentage = input.nextInt();
		input.close();
		
		System.out.println("You got " + examPercentage + "% so you " + 
		(examPercentage >= 40? "pass" : "failed") + " your exam.");

	}

}
