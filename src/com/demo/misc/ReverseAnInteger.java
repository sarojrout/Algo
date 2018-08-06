package com.demo.misc;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int x = 1230;
		int result = ReverseAnInteger.reverse(x);
		System.out.println(result);
	}
	
	private static int reverse(int num) {
		int result = 0;
		while(num !=0) {
			result = result*10+num%10;
			num = num/10;
		}
		int temp = Math.abs(result);
		return (temp>Integer.MAX_VALUE)?0:(int) result;
	}

}
