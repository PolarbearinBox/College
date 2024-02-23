import java.util.Scanner;
import java.lang.Math;

public class AverageStandardDeviation {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers separated by spaces:");
		Scanner input = new Scanner (System.in);
		
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double x3 = input.nextDouble();
		
		input.close();
		
		double average = (x1 + x2 + x3)/3;
		
		double x1Mod = x1 - average;
		double x2Mod = x2 - average;
		double x3Mod = x3 - average;
		
		double powx1 = Math.pow(x1Mod, 2.0);
		double powx2 = Math.pow(x2Mod, 2.0);
		double powx3 = Math.pow(x3Mod, 2.0);
		
		double standardDeviation = Math.sqrt(
				(powx1 + powx2 + powx3)
				/3);
				
		 System.out.printf("For numbers %.1f, %.1f, %.1f, the average is %.2f "
		 		+ "and the standard deviation is %.2f%n",
	                x1, x2, x3, average, standardDeviation);
	    }
	}