package com.demo.linkedlist;

public class CircularLinkedList {
	private Node head;
	
	public boolean isCircularLinkList() {
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	public void appendToTail(Node node) {
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.setNext(node);
	}
	
	public Node reverseAList(Node head) {
		Node reverse = head;
		Node list_todo = head.next;
		reverse.next = null;
		while(list_todo != null) {
			Node temp = list_todo;
			list_todo = list_todo.next;
			temp.next=reverse;
			reverse=temp;
		}
		return reverse;
	}
	
	static class Node {
		int data;
		Node next;
		
		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
		public void printList(Node head) {
			while(head != null) {
				head = head.next;
			}
		}
	}

}
