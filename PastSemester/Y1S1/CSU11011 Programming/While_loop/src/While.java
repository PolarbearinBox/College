import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		boolean quit = false;
		int count = 0;
		int total = 0;
		while (!quit)
		{
			System.out.print("Entre the number (or quit)");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			total += number;
			count++;
		}
		if (count != 0)
			System.out.print("Result: " + total/count);

	}

}
