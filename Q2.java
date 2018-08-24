package algorithmQuestions;

import java.util.Scanner;

public class Q2 {
	
	Scanner scan;
	
	Q2(){
		scan = new Scanner(System.in);
	}
	
	public void printSequence(){
		System.out.println("Please enter a number: ");
		int seqNum = scan.nextInt();
		
		for( int i = 1; i <= seqNum; i++){
			for(int j = 0; j < seqNum - i; j++){
				System.out.print("-");
			}
			
			System.out.print(i);
			
			for( int j = 0; j < i - 1; j++){
				System.out.print("-" + i);
			}
			
			for(int j = 0; j < seqNum - i; j++){
				System.out.print("-");
			}
			
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		Q2 q2 = new Q2();
		q2.printSequence();
		
	}
}
