package q15_minimumJump;

public class MinimumJump {
	
	public int minJump(int[] a) {
		return minJumpToLast(a, 0);
	}
	
	public int minJumpToLast(int[] a, int start){
		int minValue = 999;
		
		int value = 0;
		for(int i = start + a[start]; i > start; i --){
			if (i >= a.length - 1){
				return 1;
			}
			else{
				value = minJumpToLast(a, i) + 1;
			}
			if(minValue > value){
				minValue = value;
			}
		}
		
		return minValue;
	}

	public static void main(String[] args) {
		MinimumJump mj = new MinimumJump();
		
		int[] a = {3,1,2,1,4};
		
		int minJump = mj.minJump(a);
		System.out.println(minJump);
	}
}
