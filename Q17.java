package algorithmQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q17 {

	public List<Integer> findUniq(int[] array1, int[] array2){
		
		List<Integer> unique = new ArrayList<Integer>();
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i : array2){
			hm.put(i, 1);
		}
		
		for(int i : array1){
			if(hm.get(i) == null){
				unique.add(i);
			}
		}
			
		return unique;
	}
	
	public static void main(String[] args) {
		Q17 q17 = new Q17();
		
		List<Integer> unique = q17.findUniq(new int[]{1, 2,3,7,8}, new int[]{3,4,5,6,7});
		System.out.println(Arrays.toString(unique.toArray()));
		
	}
}
