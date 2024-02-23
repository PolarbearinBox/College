import java.util.Scanner;

public class GradeAnalysis {
	
	public static int STUDENT_NUMBER = 5;
	// BELOW ARE THE IMPROVEMENTS NEEDED:
	public static double MIN_MARK = 0.0;
	public static double MAX_MARK = 100.0;
	// END
	public static void main(String[] args) {
		
		System.out.println("Enter the 5 percentages obtained:");
		Scanner input = new Scanner (System.in);
		double[] studentMarks = new double[STUDENT_NUMBER];
		double currentMark = 0.0;
		/*
		 * int marksCount = 0;
		double percentages[] = new double[NUMBER_OF_MARKS];
		while ((marksCount < NUMBER_OF_MARKS) && (marksScanner.hasNextDouble()))
		{
			double currentMark = marksScanner.nextDouble();
			if ((currentMark >= MIN_MARK) && (currentMark <= MAX_MARK) &&
					(marksCount <= NUMBER_OF_MARKS))
			{
				percentages[marksCount] = currentMark;
				marksCount++;
			}
		}
		if (marksCount != NUMBER_OF_MARKS)
		{
			System.out.println("Invalid marks entered.  " + NUMBER_OF_MARKS +
					"marks should be entered between " + MIN_MARK + " and " + MAX_MARK + ".");
		}
		else
		{
			double averageMark = determineAverageMark( percentages );
			int numberAboveAverage = countAboveAverageStudents( percentages, averageMark );
			System.out.println("The average percentage is " + averageMark + "% and there " +
			  ((numberAboveAverage > 1) ? "were " + numberAboveAverage + " above average students." :
			      ((numberAboveAverage == 1) ? "was only 1 above average student." :
			    	  "were no above average students.")));
		}
		marksScanner.close();
	}
		 */
		for(int index = 0; index < STUDENT_NUMBER; index++)
		{
			studentMarks[index] = input.nextDouble();
		}
		input.close();
		
		double averageMark = determineAverageMark( studentMarks );
		int aboveAverageCount = countAboveAverageStudents( studentMarks, averageMark );
		
		System.out.printf("The average percentage is %.1f", averageMark);
		System.out.print("%");
		System.out.printf(" and there "
				+ ((aboveAverageCount == 0)? "were no " :"was only %d ")
				+ "above average "
				+ ((aboveAverageCount == 1)? "student." :"students."), aboveAverageCount);
	}
	
	public static double determineAverageMark( double[] marks )
	{
		double average = 0.0;
		// check and return 0.0 first;
		if ((marks == null) || (marks.length == 0))
			return 0.0;

		double[] studentMarksCopy = new double[STUDENT_NUMBER];
		System.arraycopy(marks, 0, studentMarksCopy, 0, STUDENT_NUMBER);
			
			
		for (int index = 0; index < STUDENT_NUMBER; index++)
		{
			average += studentMarksCopy[index] / (double) STUDENT_NUMBER;
		}
		
		return average;
	}
	
	public static int countAboveAverageStudents( double[] marks, double averageMark)
	{
		int count = 0;
		if (marks != null && marks.length == STUDENT_NUMBER)
		{
			
			double[] studentMarksCopy = new double[STUDENT_NUMBER];
			System.arraycopy(marks, 0, studentMarksCopy, 0, STUDENT_NUMBER);
			
			for (int index = 0; index < STUDENT_NUMBER; index++)
			{
				if (studentMarksCopy[index] > averageMark)
				{
					count ++;
				}
			}
				
		}
		return count;
	}

}
