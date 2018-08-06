package com.demo.tree;

import java.util.Stack;

public class IterativePostOrder {

	public static void main(String[] args) {
		 Node root = null;
	        root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);
	        IterativePostOrder.iterativePost(root); 
	        

	}
	
	static class Node {
		Node left;
		Node right;
		int key;
		Node(int data){
			this.key=data;
		}
	}
	static Stack<Node> s1, s2;
	static void iterativePost(Node root) {
		s1 = new Stack<Node>();
		s2 = new Stack<Node>();
		
		if(root!=null) {
			Node temp = s1.pop();
			s2.push(temp);
			if(temp.left!=null) {
				s1.push(temp.left);
			}
			if(temp.right!=null) {
				s1.push(temp.right);
			}
		}
		while(!s2.isEmpty()) {
			Node temp = s2.pop();
			System.out.println(temp.key+" ");
		}
		
	}
	

}
