package com.demo.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] myArr = {3,4,5,4,5,5,6};
	//	FindDuplicateNumber.duplicateNumbers(myArr);
		int dupno = FindDuplicateNumber.duplicateNumber(myArr);
		System.out.println(dupno);

	}
	//find all the occurences
private static void duplicateNumbers(int[] arr) {
	Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
	for(int i: arr) {
		myMap.put(i, myMap.containsKey(i)?myMap.get(i)+1:1);
	}
	for(Entry<Integer, Integer> entry: myMap.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}
//find the number who has one duplicate
private static int duplicateNumber(int[] arr) {
	Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
	for(int i: arr) {
		myMap.put(i, myMap.containsKey(i)?myMap.get(i)+1:1);
	}
	for(Entry<Integer, Integer> entry: myMap.entrySet()) {
		if(entry.getValue() == 2) {
			return entry.getKey();
		}
	}
	throw new RuntimeException("did not find dulicate");
}

}
