import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your length of your box?");
		double length = input.nextDouble();
		
		System.out.println("What is your width of your box?");
		double width = input.nextDouble();
		
		System.out.println("What is your height of your box?");
		double height = input.nextDouble();
		
		input.close();
		
		double surfaceArea = length * width * 2 + length * height * 2 + width * height *2;
		
		double volume = length * width * height;
		
		System.out.println("The surface area of a " + length + " X " + width + " X " + height + " box is " + surfaceArea);
		System.out.println("The volume of a " + length + " X " + width + " X " + height + " box is " + volume);
		
		
		
		
	}

}
