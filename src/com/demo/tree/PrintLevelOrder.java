package com.demo.tree;

import com.demo.tree.TreeInOrder.Node;

public class PrintLevelOrder {
	
	static class Node{
		int key;
		Node left;
		Node right;
		Node(int data){
			this.key=data;
			left=right=null;
		}
	}
	
	static void printLevel(Node root){
		int h=PrintLevelOrder.getHeight(root);
		int i;
		for(i=1; i<=h;i++) {
			printGIvenLevel(root,i);
			System.out.println("");
		}
		
	}
	
	static void printGIvenLevel(Node root, int level) {
		if(root==null) return;
		if(level==1) {
			System.out.println(root.key);
		}
		else if(level >1) {
			printGIvenLevel(root.left, level-1);
			printGIvenLevel(root.right, level-1);
		}
	}
	
	static int getHeight(Node root) {
		int lh=getHeight(root.left);
		int rh=getHeight(root.right);
		if(lh>rh) {
			return (lh+1);
		}else {
			return (rh+1);
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		printLevel(root);
	}

}
