package q9_checkPalidrome;

public class CheckPalidrome {
	
	public boolean check(int number) {
		Integer num = new Integer(number);
		String num_s = num.toString();
		
		for(int i = 0; i < num_s.length() / 2; i++) {
			
			if(num_s.charAt(i) != num_s.charAt(num_s.length()-1-i)) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		CheckPalidrome cp = new CheckPalidrome();
		
		int a = 123454321;
		System.out.println("Is " + a + " palidrome? " + cp.check(a));
		
		a = 1234524321;
		System.out.println("Is " + a + " palidrome? " + cp.check(a));
		
		a = 1234554321;
		System.out.println("Is " + a + " palidrome? " + cp.check(a));
		
	}

}
