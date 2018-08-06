package com.demo.array;

public class RotationOfArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		 RotationOfArray.rotateArr(arr, 2);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	
	private static void rotateArr(int[] arr, int d) {
		reverseArr(arr, 0, d-1);
		reverseArr(arr, d, arr.length-1);
		reverseArr(arr, 0, arr.length-1);
		
	}
	private static void reverseArr(int[] arr, int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
