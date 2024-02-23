import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		
		System.out.println("What is your weight in kg?");
		Scanner input = new Scanner( System.in );
		double weight = input.nextDouble();
		System.out.println("What is your height in metres?");
		double height = input.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("Your BMI is " + bmi);
		System.out.println("Your BMI is within the " + (bmi > 25?"overwieght":"normal") + " range");
		input.close();
	}

}
