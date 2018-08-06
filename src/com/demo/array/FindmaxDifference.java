package com.demo.array;

import java.util.Arrays;

public class FindmaxDifference {

	public static void main(String[] args) {
		int[] arr = {8,19,3,2,7};
		int result = FindmaxDifference.findMaxDiff(arr);
		System.out.println(result);

	}
	
	private static int findMaxDiff(int [] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i< arr.length-1; i++) {
			for(int j=i+1; j< arr.length-1; j++) {
				if(Math.abs(arr[j] - arr[i]) > max) {
					max = Math.abs(arr[j]-arr[i]);
				}
			}
			
		}
		return max;
	}

}
