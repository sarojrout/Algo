package com.demo.array;

public class CyclicRotateArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		CyclicRotateArray.cyclicRotate(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	
	private static void cyclicRotate(int[] arr) {
		int start=0;
		int end = arr.length-1;
		reverseArr(arr, start,end);
		reverseArr(arr,start+2, end);
	}
	private static void reverseArr(int[] arr, int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
