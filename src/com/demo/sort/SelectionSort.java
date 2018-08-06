package com.demo.sort;

import javax.swing.SortingFocusTraversalPolicy;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {2,6,3,1};
		SelectionSort.sorting(arr);
		
	}
	
	public static void sorting(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);	
					printList(arr);
				}
			}
			
		}
		//printList(arr);
		
	}
	
	public static void swap(int[] list, int iIndex, int jIndex) {
		int temp = list[iIndex];
		list[iIndex] = list[jIndex];
		list[jIndex] = temp;
	}
	
	public static void printList(int[] arr) {
		for(int i: arr) {
			System.out.println(i+",");
		}
		System.out.println("");
	}

}
