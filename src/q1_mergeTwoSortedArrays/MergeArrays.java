package q1_mergeTwoSortedArrays;

import java.util.Arrays;

public class MergeArrays {
	
	public int[] merge(int[] array1, int[] array2) {
		if(array1 == null || array2 == null) {
			return new int[0];
		}
		
		int length = array1.length + array2.length;
		
		if(length == 0) {
			return new int[0];
		}
		
		int[] newArray = new int[length];
		
		int array1_index = 0;
		int array2_index = 0;
		
		for (int i = 0; i < length; i++) {
			int array1_value = 99999999;
			int array2_value = 99999999;
			
			if(array1_index < array1.length) {
				array1_value = array1[array1_index];
			}
			
			if(array2_index < array2.length) {
				array2_value = array2[array2_index];
			}
			
			if(array1_value < array2_value) {
				newArray[i] = array1_value;
				array1_index ++;
			}
			else {
				newArray[i] = array2_value;
				array2_index ++;
			}
		}
		return newArray;
	}


	public static void main(String[] args) {
		
		//Test two normal array
		int[] array1 = new int[]{1,2,3,4,5,6};
		int[] array2 = new int[]{1,4,7};

		MergeArrays ma = new MergeArrays();
		
		int[] mergedArray = ma.merge(array1, array2);
		System.out.println("Merge with " + Arrays.toString(array1) + " + " + Arrays.toString(array2));
		System.out.println(Arrays.toString(mergedArray));

		// Test Two empty Array
		array1 = new int[0];
		array2 = new int[0];

		ma = new MergeArrays();
		
		mergedArray = ma.merge(array1, array2);
		
		System.out.println("Merge with " + Arrays.toString(array1) + " + " + Arrays.toString(array2));
		System.out.println(Arrays.toString(mergedArray));
		
		//Test With One Empty String
		array1 = new int[0];
		array2 = new int[] {1,2,3,4,5};

		ma = new MergeArrays();
		
		mergedArray = ma.merge(array1, array2);

		System.out.println("Merge with " + Arrays.toString(array1) + " + " + Arrays.toString(array2));
		System.out.println(Arrays.toString(mergedArray));
		
		//Test With Two Null
		array1 = null;
		array2 = null;

		ma = new MergeArrays();
		
		mergedArray = ma.merge(array1, array2);

		System.out.println("Merge with " + Arrays.toString(array1) + " + " + Arrays.toString(array2));
		System.out.println(Arrays.toString(mergedArray));
	}
}
	

