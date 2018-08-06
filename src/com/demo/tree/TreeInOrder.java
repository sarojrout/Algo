package com.demo.tree;

public class TreeInOrder {
	
	static class Node {
		int key;
		Node left;
		Node right;
		Node(int data){
			this.key=data;
			left=right=null;
		}
	}
	
	//Node root;
	static void printInOrder(Node node) {
		if(node == null) return;
		printInOrder(node.left);
		System.out.println(node.key+"");
		printInOrder(node.right);
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		TreeInOrder.printInOrder(root);
	}

}
