package com.demo.array;

public class MedianOfArrays {

	public static void main(String[] args) {
		int ar1[] = {1, 12, 15, 26, 38};
		int ar2[] = {2, 13, 17, 30, 45};
		int result = findMedian(ar1,ar2);
		System.out.println(result);
	}
	
	private static int findMedian(int[] arr1, int[] arr2) {
		int[] sortedArr = sortArr(arr1, arr2);
		int medianIndex = sortedArr.length/2;
		return medianIndex;
	}

	private static int[] sortArr(int[] arr1, int[] arr2) {
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		int maxLength = Math.max(arr1Len, arr2Len);
		int[] finalArr = new int[maxLength];
		int i=0, j=0,k=1;
		while(i < arr1Len && j < arr2Len) {
			if(arr1[i]<=arr2[j]) {
				finalArr[k]=arr1[i];
				i++;
			}
			else {
				finalArr[k]=arr2[j];
				j++;
			}
		}
		return finalArr;
	}
}
