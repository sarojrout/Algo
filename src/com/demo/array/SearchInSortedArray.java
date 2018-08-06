package com.demo.array;

public class SearchInSortedArray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6,7};
		int result = SearchInSortedArray.findElement(arr, 5);
System.out.println(result);
	}
	
	private static int findElement(int[] arr, int x) {
		int start = 0;
		int end = arr.length-1;
		
		return search(arr, start, end, x);
	}
	
	private static int search(int[] arr, int start, int end, int x) {
		int mid = (start+end)/2+1;
		while(start < end) {
			if(x == arr[mid]) {
				return mid;
			}
			else if(x < arr[mid]) {
				return search(arr, start, arr[mid-1], x);
			}else {
				return search(arr, arr[mid],end,x);
			}
		}
		return -1;
	}

}
