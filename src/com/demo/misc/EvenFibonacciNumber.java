package com.demo.misc;

public class EvenFibonacciNumber {
	public static void main(String[] args) {
		int result = sumOfEvenFIbonacci(10);
	}

	public static int[] findFibonacci(int data) {
		int[] arr = new int[0];
		for(int i=2; i< arr.length; i++) {
			i = i-1+i-2;
		}
		return arr;
	}
	private static int sumOfEvenFIbonacci(int arr) {
		int sum=0;
		int[] fibArr = findFibonacci(arr);
		for(int i=0; i< fibArr.length; i++) {
			if(fibArr[i]%2==0) {
				sum+=fibArr[i];
			}
		}
		return sum;
	}
}
