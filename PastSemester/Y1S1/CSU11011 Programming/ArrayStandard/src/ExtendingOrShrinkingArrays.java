
public class ExtendingOrShrinkingArrays {

	public static void main(String[] args) {
		int[] array = {3, 14, 25};
		int[] tempArray = new int [array.length + 1];
		System.arraycopy(array, 0, tempArray, 0, array.length);
		tempArray[tempArray.length - 1] = 46;
		array = tempArray;

	}

}
