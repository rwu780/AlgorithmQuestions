package algorithmQuestions;

import java.util.HashMap;

public class Q10 {
	
	public int mostFrequent(int[] array){
		
		int maxKey = -1;
		int maxValue = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int key : array){
			int value = 0;
			if(hm.get(key) == null){
				value = 1;
				hm.put(key, value);
			}
			else{
				value = hm.get(key) + 1;
				hm.replace(key, value);
			}
			
			if(value > maxValue){
				maxValue = value;
				maxKey = key;
			}
		}
		
		return maxKey;
	}
	
	public static void main(String[] args) {
		Q10 q10 = new Q10();
		
		
		int[] a = {1, 2, 3, 4, 5, 3, 2, 4, 5, 2, 6, 2, 6, 78, 1, 5, 21};
		int max = q10.mostFrequent(a);
		System.out.println("Most frequenct interger is " + max);
	}
	
	

}
