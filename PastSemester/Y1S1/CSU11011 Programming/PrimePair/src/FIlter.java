import java.util.Scanner;
import java.math.*;
public class FIlter {

	public static void main(String[] args) {
		int []numbers = new int[9999];
	//int [] filteredNumbers = new int[9999];
	for (int initialCount = 1; initialCount <= (numbers.length); initialCount ++)
	{
		numbers[initialCount] = initialCount;
	}
	
	for (int number : numbers)
	{
		System.out.print(number + "");
	}
	/*
	for (int filter = 2; filter <= (numbers.length + 1); filter ++)
	{
		for (int filterMultiple = 2; (filterMultiple * filter <= 100) ; filterMultiple ++)
		{
			int filtered = filter * filterMultiple;
		}
	}
	
	for (int prime : numbers)
	{
		System.out.println(prime);
	}
	*/
	
	}

}
