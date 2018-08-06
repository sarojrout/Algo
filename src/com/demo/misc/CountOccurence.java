package com.demo.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.management.RuntimeErrorException;

public class CountOccurence {

	public static void main(String[] args) {
		CountOccurence.countOccurence("abcccdba");

	}
	
	private static void countOccurence(String str) {
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		for(char ch: str.toCharArray()) {
			myMap.put(ch, myMap.containsKey(ch)?myMap.get(ch)+1:1);
		}
		for(Entry<Character, Integer> entry: myMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
