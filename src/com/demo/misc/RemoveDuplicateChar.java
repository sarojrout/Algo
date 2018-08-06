package com.demo.misc;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		Set<Character> resultSet = RemoveDuplicateChar.removeDupChar("pwwkew");
		System.out.println(resultSet.size());
	}
	
	private static Set<Character> removeDupChar(String str) {
		char[] charArr = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(char ch: charArr) {
			if(!set.contains(ch)) {
				set.add(ch);
			}
		}
		return set;
	}

}
