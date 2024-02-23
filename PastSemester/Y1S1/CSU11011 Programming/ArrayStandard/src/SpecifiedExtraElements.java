import java.util.Scanner;
public class SpecifiedExtraElements {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] array = {1, 2, 3};
		System.out.println("How many extra elements do you want to have >> ");
		int extraElements = input.nextInt();
		System.out.println("What is the initial value >> ");
		int initialValue = input.nextInt();
		
		int[] modifiedArray = extraElements(array, extraElements, initialValue);
		
		System.out.print(modifiedArray);

	}
	
	public static int[] extraElements(int[] array, int extraElements, int initialValue)
	{
		// int cellsToAdd = (extraElements > 0)? extraElements: 0;
		int[] newArray = new int[(array == null)? extraElements: array.length + extraElements];
		
		if (array != null)
		{
			System.arraycopy(array, 0, newArray, 0, array.length);
		}
		
		// if (extraElements != 0)
		for (int index = 0; index < newArray.length;index++)
		{
			newArray[index] = initialValue;
		}
		
		return newArray;
	}

}
