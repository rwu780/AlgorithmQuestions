package q8_checkAnagrams;

import java.util.HashMap;

public class CheckAnagrams {

	HashMap<Character, Integer> hm;
	
	public CheckAnagrams() {
		hm = new HashMap<Character, Integer>();
	}
	
	public boolean check(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		if(s1.length() == 0) {
			return true;
		}
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		hm.clear();
		
		for (int i = 0; i < s2.length(); i++) {
			char key = s2.charAt(i);
			
			if(hm.containsKey(key)) {
				int value = hm.get(key) + 1;
				hm.replace(key, value);
			}
			if(!hm.containsKey(key)) {
				hm.put(key, 1);
			}
		}
		
		for (int i = 0; i < s1.length(); i++) {
			char key = s1.charAt(i);
			if(!hm.containsKey(key)) {
				return false;
			}
			
			int value = hm.get(key) - 1;
			if(value == 0) {
				hm.remove(key);
			}
			else {
				hm.replace(key, value);
			}
		}
		
		if(!hm.isEmpty()) {
			return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		CheckAnagrams ca = new CheckAnagrams();
		
		String s1 = "stop";
		String s2 = "Pots";
		System.out.println("Is " + s1 + " " + s2 + " anagrams? " + ca.check(s1, s2));
		
		s1 = "abcd";
		s2 = "aaabbbcccddd";
		System.out.println("Is " + s1 + " " + s2  + " anagrams? " + ca.check(s1, s2));
		
		s1 = "ccbbb";
		s2 = "bbccba";
		System.out.println("Is " + s1 + " " + s2  + " anagrams? " + ca.check(s1, s2));
	}
	
	

}
