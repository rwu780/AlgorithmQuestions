package q2_printPattern;

import java.util.Scanner;

public class PrintPattern {

	Scanner scan;
	
	PrintPattern(){
		scan = new Scanner(System.in);
	}
	
	public void print() {
		System.out.println("Please enter a integer: ");
		
		int num = scan.nextInt();
		
		double startTime = System.currentTimeMillis();

		
		for(int i = 1; i <= num; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < num - i; j++) {
				sb.append("-");
			}
			
			sb.append(i);
			for(int j = 1; j < i; j++) {
				sb.append("-");
				sb.append(i);
			}
			
			for(int j = 0; j < num - i; j++) {
				sb.append("-");
			}
			System.out.println(sb.toString());
		}
		double endTime = System.currentTimeMillis();
		
		System.out.println("Runtime: " + (endTime - startTime));
	}

	public static void main(String[] args) {
		PrintPattern pp = new PrintPattern();
		pp.print();
		
	}
}
