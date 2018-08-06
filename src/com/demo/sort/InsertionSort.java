package com.demo.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] input = {4,2,6,3};
		InsertionSort.insertionSort(input);
		//printList(input);
	}

	private static void insertionSort(int[] list) {
		for(int i=0; i< list.length-1; i++) {
			for(int j=i+1; j>0;j--) {
				if(list[j] < list[j-1]) {
					swap(list, j, j-1);
				}else {
					break;
				}
				printList(list);
			}
			
		}
	}
	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	public static void printList(int[] list) {
		for(int i: list) {
			System.out.println(i);
		}
	}
}
