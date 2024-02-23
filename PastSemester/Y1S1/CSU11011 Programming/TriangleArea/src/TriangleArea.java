import java.util.Scanner;
import java.lang.Math;

public class TriangleArea {

	public static void main(String[] args) {
		
		System.out.println("Enter the coordinates of the triangle separated");
		System.out.println("by spaces (x1 y1 x2 y2 x3 y3):");
		Scanner input = new Scanner (System.in);
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		input.close();
		
		double area = areaCalculator(x1, y1, x2, y2, x3, y3);
				
		System.out.printf("The area of triangle ((%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f)) is %.2f", 
				x1, y1, x2, y2, x3, y3, area);
	}
	
	public static double areaCalculator (double x1, double y1, double x2, double y2, double x3, double y3)
	{
		double area = Math.abs(
				((x1 * (y2-y3)) + (x2 * (y3-y1)) + (x3 * (y1 - y2)))
				/2
				);
		return area;
	}
	

}
