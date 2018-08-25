package q13_binarySearchTree;

public class MainApp {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(5);
		bst.insert(1);
		bst.insert(10);
		bst.insert(3);
		bst.insert(20);
		bst.insert(30);
		
		System.out.println("Program End");
		
//		bst.delete(5);
		bst.delete(20);
		
		System.out.println("Program End");
		
	}

}
