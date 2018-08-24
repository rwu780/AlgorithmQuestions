package algorithmQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q11 {
	
	Scanner scan;
	
	public Q11(){
		scan = new Scanner(System.in);
	}

	public List<Integer> findPrime(){
		System.out.println("Please enter a number");
		
		int n = scan.nextInt();
		
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(1);
		
		if(n < 2){
			
			return prime;
		}
		
		for (int i = 2; i < n; i++) {
			boolean isPrime = true;
			for(int j : prime){
				if(i % j == 0 && j != 1){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				prime.add(i);
			}
		}

		return prime;
	}
	
	public static void main(String[] args) {
		Q11 q11 = new Q11();

		List<Integer> prime = q11.findPrime();
		System.out.println("Prime Array: " + Arrays.toString(prime.toArray()));
	}
}
