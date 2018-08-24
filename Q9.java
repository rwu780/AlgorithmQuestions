package algorithmQuestions;

public class Q9 {
	
	public boolean isPalidrome(int a){
		Integer obj_a = new Integer(a);
		String s = obj_a.toString();
		
		int s_length = s.length();
		
		for (int i = 0; i < s_length / 2; i++) {
			//System.out.println(s.charAt(i) + " " + s.charAt(s_length - i -1));
			if(s.charAt(i) != s.charAt(s_length-1-i)){
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Q9 q9 = new Q9();
		
		int a = 123454321;
		System.out.println("Is " + a + " palidrome? " + q9.isPalidrome(a));
		
		a = 1234524321;
		System.out.println("Is " + a + " palidrome? " + q9.isPalidrome(a));
		
		a = 1234554321;
		System.out.println("Is " + a + " palidrome? " + q9.isPalidrome(a));
		
	}
}
