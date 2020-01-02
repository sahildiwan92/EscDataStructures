package com.sd.bt.prob2;

// https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
// Tree traversal using recursion

class Node{
	int key;
	Node left,right;
	
	Node(int key){
		this.key=key;
		this.left=this.right=null;
	}
}

public class BinaryTree {
	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void printInorderTraversal(Node node){
		if(node ==null)
			return;
		printInorderTraversal(node.left);
		System.out.print(node.key+" ");
		printInorderTraversal(node.right);
	}
	
	public void printPreOrderTraversal(Node node){
		if(node ==null)
			return;
		System.out.print(node.key+" ");
		printPreOrderTraversal(node.left);
		printPreOrderTraversal(node.right);
	}
	
	public void printPostOrderTraversal(Node node){
		if(node ==null)
			return;
		printPostOrderTraversal(node.left);
		printPostOrderTraversal(node.right);
		System.out.print(node.key+" ");
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Inorder Traversal of the Tree");
		tree.printInorderTraversal(tree.root);
		System.out.println();
		System.out.println("Preorder Traversal of the Tree");
		tree.printPreOrderTraversal(tree.root);
		System.out.println();
		System.out.println("Postorder Traversal of the Tree");
		tree.printPostOrderTraversal(tree.root);
	}
}
