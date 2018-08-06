package com.demo.misc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatativeChar {

	private static char findFirstNonRepeatChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>(str.length());
		for(char ch: str.toCharArray()) {
			counts.put(ch, counts.containsKey(ch) ? counts.get(ch)+1 : 1);
		}
		for(Entry<Character, Integer> entry: counts.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("did not find any key");
	}
	
	public static void main(String[] args) {
		Character ch = FirstNonRepeatativeChar.find1stNonrepeatChar("hello");
		System.out.println(ch);
	} 
	
	private static char find1stNonrepeatChar(String str) {
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		for(char ch: str.toCharArray()) {
			myMap.put(ch, myMap.containsKey(ch)?myMap.get(ch)+1:1);
		}
		for(int i=0; i<str.length(); i++) {
			//char c = str.charAt(i);
			if(myMap.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}
		}
		throw new RuntimeException("no repeating char");
	}
	
}
