package algorithmQuestions;

public class Q15 {

	public int jumpToLast(int[] a, int start){
		int minValue = 999;
		
		int value = 0;
		for(int i = start + a[start]; i > start; i --){
			if (i >= a.length - 1){
				return 1;
			}
			else{
				value = jumpToLast(a, i) + 1;
			}
			if(minValue > value){
				minValue = value;
			}
		}
		
		return minValue;
	}

	public static void main(String[] args) {
		Q15 q15 = new Q15();
		
		int[] a = {2,1,1,1,4};
		
		int minJump = q15.jumpToLast(a, 0);
		System.out.println(minJump);
	}
	
	
}
