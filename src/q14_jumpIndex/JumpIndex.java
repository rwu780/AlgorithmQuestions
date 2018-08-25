package q14_jumpIndex;

public class JumpIndex {
	
	public boolean canJump(int[] a) {

		if (a.length < 1) {
			return true;
		}

		int maxJump = a[0];

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] == 0) {
				continue;
			}
			if (i > maxJump) {
				return false;
			}
			if (i + a[i] > maxJump && a[i] != 0) {
				maxJump = i + a[i];
			}
			if (maxJump >= a.length - 1) {
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		JumpIndex ji = new JumpIndex();
		int[] a = { 3, 2, 1, 0, 4 };

		System.out.println("Can reach? " + ji.canJump(a));

		a = new int[] { 2, 3, 0, 2, 0, 1, 1, 4 };

		System.out.println("Can reach? " + ji.canJump(a));
	}

}
