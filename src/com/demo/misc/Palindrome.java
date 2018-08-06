package com.demo.misc;

public class Palindrome {

	public static void main(String[] args) {
		
System.out.println(Palindrome.isPalindrome("radar"));
	}
	
	private static boolean isPalindrome(String str) {
		for(int i=0; i< str.length()-1; i++) {
			for(int j=str.length()-1;j>=0;j--) {
				if(str.charAt(i) !=str.charAt(j)) {
					return false;
				}
				i++;				
			}
		}
		return true;
	}

}
