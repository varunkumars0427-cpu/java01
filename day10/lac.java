package day10;

public class lac {
	static class Node {
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
		}
	}
	static Node findLCA(Node root, int n1, int n2) {
		if(n1 < root.data && n2 < root.data) {
			return findLCA(root.left, n1, n2);
		}
		
		if(n1 > root.data && n2 > root.data) {
			return findLCA(root.right,n1,n2);
		}
		return root;
	}
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
	}
}