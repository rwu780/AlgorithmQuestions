package q10_findMostFrequentInteger;

import java.util.HashMap;

public class MostFrequent {

	HashMap<Integer, Integer> hm;
	
	MostFrequent(){
		hm = new HashMap<Integer, Integer>();
	}
	
	public void find(int[] array) {
		
		if(array.length == 0) {
			System.out.println("The array is empty");
			return;
		}
		
		hm.clear();
		int maxKey = -999;
		int maxValue = 0;
		
		for (int i : array) {
			int value = 0;
			if(hm.containsKey(i)) {
				value = hm.get(i) + 1;
				hm.replace(i, value);
			}else {
				value = 1;
				hm.put(i, value);
			}
			
			if(value >= maxValue) {
				maxValue = value;
				maxKey = i;
			}
		}
		
		System.out.println("The most frequent integer is: " + maxKey + ", it appears " + maxValue + " times.");
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 3, 2, 4, 5, 2, 6, 2, 6, 78, 1, 5, 21};
		
		MostFrequent mf = new MostFrequent();
		mf.find(a);
		
	}
}
