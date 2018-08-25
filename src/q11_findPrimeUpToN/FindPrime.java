package q11_findPrimeUpToN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindPrime {
	
	Scanner scan;
	
	FindPrime(){
		scan = new Scanner(System.in);
	}
	
	public List<Integer> find() {
		System.out.println("Please enter a number: ");
		int number = scan.nextInt();
		
		List<Integer> prime = new ArrayList<Integer>();
		
		if(number < 2) {
			return prime;
		}
		
		prime.add(2);
		
		for (int i = 2; i < number; i++) {
			boolean isPrime = true;
			for(int j : prime) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
		
			if(isPrime) {
				prime.add(i);
			}
		
		}
		
		return prime;
		
	}
	
	public static void main(String[] args) {
		
		FindPrime fp = new FindPrime();
		List<Integer> prime = fp.find();
		System.out.println("Prime Array: " + Arrays.toString(prime.toArray()));
		
	}

}
