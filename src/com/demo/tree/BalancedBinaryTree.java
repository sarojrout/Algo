/**
 * 
 */
package com.demo.tree;

/**
 * @author srout
 *
 */
public class BalancedBinaryTree {

	public boolean isBalanced(Node<Integer> head) {
		if(head == null) return false;
		if(getHeight(head) == -1) {
			return false;
		}else {
			return true;
		}
	}
	
	public int getHeight(Node<Integer> root) {
		int leftH = getHeight(root.left);
		int rightH = getHeight(root.right);
		if(leftH == -1 || rightH == -1) {
			return -1;
		}
		int diff = leftH - rightH;
		if(diff > 1) {
			return -1;
		} else {
			return Math.max(leftH, rightH)+1;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BalancedBinaryTree tree = new BalancedBinaryTree();
		Node<Integer> head = new Node<Integer>(8);
		head.left = new Node<Integer>(7);
		head.right = new Node<Integer>(12);
		head.left.left = new Node<Integer>(5);
		head.left.right = new Node<Integer>(6);
		
		head.right.left = new Node<Integer>(9);
		head.right.right = new Node<Integer>(10);
		
		boolean result = tree.isBalanced(head);
		System.out.println(result);

	}
	
	static class Node<T> {
		T data;
		Node<T> left;
		Node<T> right;
		
		Node(T data){
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getLeft() {
			return left;
		}

		public void setLeft(Node<T> left) {
			this.left = left;
		}

		public Node<T> getRight() {
			return right;
		}

		public void setRight(Node<T> right) {
			this.right = right;
		}
	}

}
