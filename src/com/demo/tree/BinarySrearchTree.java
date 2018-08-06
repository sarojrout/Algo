package com.demo.tree;

public class BinarySrearchTree {

	private boolean isBST(Node<Integer> head, int low, int high) {
		if(head == null) return true;
		if(head.getData() <= low || head.getData() > high) return false;
		return isBST(head.getLeftChild(), low, head.getData()) && isBST(head.getRightChild(), head.getData(), high);
	}
	
	public static void main(String[] args) {
		BinarySrearchTree tree = new BinarySrearchTree();
		Node root = new Node(8);
		root.leftChild = new Node(3);
		root.rightChild = new Node(10);
		root.leftChild.leftChild = new Node(2);
		root.leftChild.rightChild = new Node(4);
		
		if(tree.isBST(root, 1, 15)) {
			System.out.println("its true");
		} else {
			System.out.println("its false");
		}

	}
	
	static class Node<T> {
		T data;
		Node<T> leftChild;
		Node<T> rightChild;
		Node(T data){
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(Node<T> leftChild) {
			this.leftChild = leftChild;
		}
		public Node<T> getRightChild() {
			return rightChild;
		}
		public void setRightChild(Node<T> rightChild) {
			this.rightChild = rightChild;
		}
	}	

}
