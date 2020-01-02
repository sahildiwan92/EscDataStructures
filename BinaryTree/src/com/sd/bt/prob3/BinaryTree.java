package com.sd.bt.prob3;

import java.util.Stack;

// https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/

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
	
	public void inOrderTraversal(Node node){
		if(root == null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		
		while(curr!=null || s.size()>0){
			
			while(curr!=null){
				s.push(curr);
				curr=curr.left;
			}
			
			curr =s.pop();
			System.out.print(curr.key+" ");
			
			curr=curr.right;
			
			
		}
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Inorder traversal without using recursion");
		tree.inOrderTraversal(tree.root);
	}
}
