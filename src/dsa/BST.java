package dsa;


class Node{
	int data;
	Node left; 
	Node right; 
	
	public Node(int data) {
		this.data = data;
	}
}

public class BST {
	Node root;
	
	public void insert(int data) {
		root = insertImplementaion(root, data);	
	}
	
	public Node insertImplementaion(Node root, int data) {
		if(root == null) {
			root = new Node(data);
		}
		else if(data < root.data) {
			root.left = insertImplementaion(root.left, data);
		}
		else if(data > root.data) {
			root.right = insertImplementaion(root.right, data);
		}
		return root; 
	}
	
	public void inOrder() {
		inOrderImplementation(root);
	}
	
	public void inOrderImplementation(Node root) {
		if(root != null) {
			inOrderImplementation(root.left);
			System.out.print(root.data+" ");
			inOrderImplementation(root.right);
		}
	}
	
	public void preOrder() {
		preOrderImplementation(root);
	}
	
	public void preOrderImplementation(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
			preOrderImplementation(root.left);
			preOrderImplementation(root.right);
		}
	}
	
	public void postOrder() {
		postOrderImplementation(root);
	}
	
	public void postOrderImplementation(Node root) {
		if(root != null) {
			postOrderImplementation(root.left);
			postOrderImplementation(root.right);
			System.out.print(root.data+" ");
		}
	}
	

}
