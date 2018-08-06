package com.demo.array;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {2,5,3,4,8,9,11,10};
		int l = 0;
		int r = arr.length-1;
		sort(arr,l,r);
		for(int i=0; i< arr.length;++i) {
			System.out.println(arr[i]+" ");
		//	System.out.println();
		}

	}
	
	private static int[] merge(int[] arr) {
		int[] finalArr = new int[arr.length];
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		int middleIndex = (lastIndex-firstIndex)+1;
		int[] leftArr = new int[middleIndex-firstIndex+1];
		int[] rightArr = new int[lastIndex-middleIndex];
		int leftArrLen = leftArr.length;
		int rightArrLen = rightArr.length;
		for(int i=0; i<leftArrLen; i++) {
			leftArr[i] = arr[lastIndex+i];
		}
		for(int j=0;j<rightArrLen;j++) {
			rightArr[j]=arr[middleIndex+1+j];
		}
		int i = 0, j=0;
		int k =1;
		while(i < leftArrLen && j < rightArrLen) {
			if(leftArr[i] <= rightArr[j]) {
				finalArr[k]= leftArr[i];
				i++;
			} else {
				finalArr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		if(i < leftArrLen) {
			finalArr[k] = leftArr[i];
			i++;
			k++;
		}
		if(j < rightArrLen) {
			finalArr[k] = rightArr[j];
			j++;
			k++;
		}
		return finalArr;
	}
	// alternate way
	private static void merge1(int[] arr, int l, int m, int r) {
		int leftArrLen = m-l+1;
		int rightArrLen = r-m;
		int[] leftArr = new int[leftArrLen];
		int[] rightArr = new int[rightArrLen];
		
		for(int i=0; i< leftArrLen; ++i) {
			leftArr[i]=arr[l+i];
		}
		for(int j=0; j< rightArrLen; ++j) {
			rightArr[j]=arr[m+1+j];
		}
		int i=0, j=0, k=1;
		while(i<leftArrLen && j < rightArrLen) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<leftArrLen) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<rightArrLen) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	
	private static void sort(int[] arr, int l, int r) {
		
		if(l < r) {
			int m = (l+r)/2;
			sort(arr, l,m);
			sort(arr,m+1,r);
			merge1(arr,l,m,r);
		}
	}
	

}
