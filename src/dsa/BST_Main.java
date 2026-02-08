package dsa;

public class BST_Main {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(5);
		tree.insert(3);
		tree.insert(2);
		tree.insert(7);
		tree.insert(6);
		tree.insert(20);
		tree.insert(10);
		tree.insert(4);
		tree.insert(1);
		tree.insert(11);
		tree.insert(16);	
		
		System.out.println("**********InOrder************");
		tree.inOrder();
		
		System.out.println("\n");
		System.out.println("**********PreOrder************");
		tree.preOrder();
		
		System.out.println("\n");
		System.out.println("**********PostOrder************");
		tree.postOrder();

	}
}	
		
		
		















		
		
		

		


