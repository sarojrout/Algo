package com.demo.linkedlist;
/**
 * The idea is to first find middle of a linked list using two pointers,
 *  first one moves one at a time and second one moves two at a time. 
 *  When second pointer reaches end, first reaches middle. 
 *  We also keep track of previous of first pointer so that we can remove middle node from its current position and can make it head.
 * @author srout
 *
 */
public class MoveMiddleElemToHead {

	public static void main(String[] args) {
//		Node a = new Node(2);
//		Node b = new Node(4);
//		Node c = new Node(3);
//		Node d = new Node(7);
//		Node e = new Node(6);
//		a.next=b;
//		b.next=c;
//		c.next=d;
//		d.next=e;
		//head = null;
		for(int i=5; i>0; i--) {
			push(i);
		}
//		Node head = new Node(2);
//		head.next=new Node(3);
//		head.next.next=new Node(5);
//		head.next.next.next=new Node(7);
//		head.next.next.next.next=new Node(8);
		printList(head);
		setMiddleHead();
		printList(head);
	//	int result = countRotations(head);
	//	System.out.println(result);
	}
	static Node head;
	
	private static void printList(Node head) {
		while(head !=null) {
			System.out.println(head.data+"->");
			head=head.next;
		}
		System.out.println();
	}
	public static void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public static void setMiddleHead() {
		if(head ==null) return;
		Node fast=head;
		Node slow = head;
		Node prev = null;
		while(fast !=null && fast.next!=null) {
			prev=slow; //2
			fast = fast.next.next; //5
			slow = slow.next; //3
		}
		prev.next=prev.next.next; // 4
		slow.next=head; // 1
		head=slow; //3
	}
	
	private static int countRotations(Node head) {
		int count =0;
		int min = head.data;
		while(head !=null) {
			if(min > head.data) {
				break;	
			}
			count++;
			head = head.next;
		}
		return count;
	}
	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
}
