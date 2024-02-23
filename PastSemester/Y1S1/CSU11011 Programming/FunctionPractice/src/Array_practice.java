
public class Array_practice {

	public static void main(String[] args) {
		
		int[] array1 = {3, 14, 8};
		int[] array2 = {5, 67};
		
		//if (array2 != null) if array2 == null I don't need to do anything!
		/*{
		 * if (array1 == null)
		 * {
		 * 	array1 = array2.clone();
		 * }
		 * else
		 * {
		 * 	the colourful stuff
		 * }
		 *}
		 */
		int[] array3 = new int [array1.length + array2.length];
		System.arraycopy(array1, 0, array3, 0, array1.length);
		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		array1 = array3;
		
		for(int index = 0; index < array1.length; index++)
		System.out.print((index == array1.length - 1)? 
				array1[index]: array1[index] + ", ");
		
		// Take care of the case when array = null;
	}

}
