package com.demo.misc;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		Set<Character> result = LengthOfLongestSubstring.lengthOfLongestSubString("abcccdee");
		System.out.println(result);
		System.out.println(result.size());
	}
	
	private static Set<Character> lengthOfLongestSubString(String str) {
		char[] charArr = str.toCharArray();
		Set<Character> mySet = new HashSet<Character>();
		for(char ch:charArr) {
			if(!mySet.contains(ch)) {
				mySet.add(ch);
			}
		}
		return mySet;
	}

}
