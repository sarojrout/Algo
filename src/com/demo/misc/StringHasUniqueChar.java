package com.demo.misc;

import java.util.Arrays;

public class StringHasUniqueChar {

	public static void main(String[] args) {
		boolean result = StringHasUniqueChar.uniqueChar("abcd");
		System.out.println(result);
	}

	private static boolean hasUniqueChar(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j< str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
			
		}
		return true;
	}
	
	private static boolean uniqueChar(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		for(int i=0; i< charArr.length-1;i++) {
			if(charArr[i] == charArr[i+1]) {
				return false;
			}
		}
		return true;
	}
}
