package com.demo.misc;

public class Anagram {

	public static void main(String[] args) {
		boolean result = Anagram.isAnagram2("abcd", "cabd");
		System.out.println(result);
	}
	
	private static boolean isAnagram(String s1, String s2) {
		while(s1.length() == s2.length()) {
			for(char ch1: s1.toCharArray()) {
				for(char ch2: s2.toCharArray()) {
					if(ch1 == ch2) {
						return true;	
					}
					continue;
				}
			}
		}
		return false;
	}
	
	private static boolean isAnagram1(String s1, String s2) {
		while(s1.length() == s2.length()) {
			for(int i=0; i<s1.length()-1;i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					break;
				}
			}
			return true;
		}
		return false;
	}
	
	private static boolean isAnagram2(String s1, String s2) {
		String temp = "";
		if(s1.length() != s2.length()) return false;
		for(int i=0; i<s1.length(); i++) {
			for(int j=0; j<s2.length(); j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					temp = s1.substring(i, i+1);
					s2 = s2.replace(temp, "");
				}
			}
		}
		if(s2.isEmpty()) {
			return true;
		}
		return false;
	}

}
