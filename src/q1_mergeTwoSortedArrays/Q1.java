package algorithmQuestions;

public class Q1 {
	
	public int[] mergeArray(int[] array1, int[] array2)
	{
		int length = array1.length + array2.length;
		int[] newArray = new int[length];
		
		int array1_index = 0;
		int array2_index = 0;
		
		for(int i = 0; i < length; i++){
			
			if(array1_index < array1.length && array2_index < array2.length){
				
				if(array1[array1_index] <= array2[array2_index]){
					newArray[i] = array1[array1_index];
					array1_index ++;
				}
				else if(array1[array1_index] > array2[array2_index]){
					newArray[i] = array2[array2_index];
					array2_index ++;
				}
			}
			else if (array1_index >= array1.length && array2_index < array2.length){
				newArray[i] = array2[array2_index];
				array2_index ++;
			}
			else if (array1_index < array1.length && array2_index >= array2.length){
				newArray[i] = array1[array1_index];
				array1_index ++;
			}
		}
		
		return newArray;
	}
	
	
	
	public static void main(String[] args) {
		int[] array1 = new int[]{1,2,3,4,5,6};
		int[] array2 = new int[]{1,4,7};
		
		Q1 q1 = new Q1();
		
		int[] mergedArray = q1.mergeArray(array1, array2);
		
		for (int i: mergedArray){
			System.out.print(i);
		}
	}

}
