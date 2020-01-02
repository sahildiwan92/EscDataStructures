package com.sd.bt.prob4;

import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/level-order-tree-traversal/
// Level Order traversal using Queue DataStructure

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
	
	void printLevelOrderTraversal(){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node tempNode = queue.poll();
			System.out.print(tempNode.key+" ");
			
			if(tempNode.left!=null){
				queue.add(tempNode.left);
			}
			
			if(tempNode.right!=null){
				queue.add(tempNode.right);
			}
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Level Order Traversal");
		tree.printLevelOrderTraversal();
	}
}
