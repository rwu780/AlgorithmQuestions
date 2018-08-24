package algorithmQuestions;

import java.util.HashMap;

public class Q8 {
	
	public boolean isAnagrams(String s1, String s2){
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()){
			return false;
		}
		if(s1.length() == 0){
			return true;
		}
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s2.length(); i++) {
			
			char key = s2.charAt(i);
			
			if(hm.get(key) == null){
				hm.put(key, 1);
			}
			else{
				int value = hm.get(key);
				hm.replace(key, value+1);
			}
		}
		
		for (int i = 0; i < s1.length(); i++) {
			char key = s1.charAt(i);
			
			if(hm.get(key) == null){
				return false;
			}
			else{
				int value = hm.get(key) - 1;
				if(value == 0){
					hm.remove(key);
				}
				else{
					hm.replace(key, value);
				}
			}
		}
		
		if(!hm.isEmpty()){
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Q8 q8 = new Q8();
		
		String s1 = "stop";
		String s2 = "Pots";
		System.out.println("Is " + s1 + " " + s2 + " anagrams? " + q8.isAnagrams(s1, s2));
		
		s1 = "aaabcde";
		s2 = "adacbae";
		System.out.println("Is " + s1 + " " + s2  + " anagrams? " + q8.isAnagrams(s1, s2));
		
		s1 = "ccbbb";
		s2 = "bbccba";
		System.out.println("Is " + s1 + " " + s2  + " anagrams? " + q8.isAnagrams(s1, s2));
	}
}
