import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		System.out.println("What is your number?");
		Scanner input = new Scanner (System.in); 
		// define a new type called Scanner,
		// and the name of the particular Scanner is "input"
		// calling "new" to request a new object of that type
		int number = input.nextInt();
		/* 
		 * define a new variable "number" whose type is interger
		 * execute function nextInt() to variable "input" (Store to input?? like ARM)
		 * and this value is given to "number"
		 */
		/*
		 * To send a message to the object "input"
		 * you state the name of the object 
		 * and connect it to the message request with a period "."
		 */
		input.close();
		
		System.out.println("Your number is " + 
		(number%2 == 0? "even." : "odd.") );

	}

}
