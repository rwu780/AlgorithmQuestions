package q17_findUniqueElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UniqueElement {
	
	HashMap<Integer, Integer> hm;
	
	UniqueElement(){
		hm = new HashMap<Integer, Integer>();
	}
	
	public List<Integer> uniqueFirstArray(int[] array1, int[] array2){
		List<Integer> uniq = new ArrayList<Integer>();
		
		hm.clear();
		for(int i : array2) {
			hm.put(i, 1);
		}
		
		for(int i : array1) {
			if(!hm.containsKey(i)) {
				uniq.add(i);
			}
		}
		
		return uniq;
	}
	
	public static void main(String[] args) {
		UniqueElement ue = new UniqueElement();
		
		List<Integer> unique = ue.uniqueFirstArray(new int[]{1, 2,3,7,8}, new int[]{3,4,5,6,7});
		System.out.println(Arrays.toString(unique.toArray()));
		
	}

}
