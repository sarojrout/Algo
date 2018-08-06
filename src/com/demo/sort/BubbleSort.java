package com.demo.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] list = {2,4,3,6};
		BubbleSort.sort(list);
		printList(list);
	}
	
	public static void sort(int[] list) {
		boolean swap = false;
		for(int i=0; i< list.length-1;i++) {
			for(int j=list.length-1; j>i;j--) {
				if(list[j] > list[j-1]) {
					swap(list, j, j-1);
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}
	
	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	private static void printList(int[] list) {
		for(int i: list) {
			System.out.println(i);
		}
	}

}
