package com.demo.array;

import java.util.HashMap;
import java.util.Map;

public class Findpair {

	public static void main(String[] args) {
		int[] arr = {3,4,6,7,8,9};
		Map<Integer, Integer> result = Findpair.findPairElements(arr, 9);
		System.out.println(result);

	}
	
	private static Map<Integer, Integer> findPairElements(int[] arr, int x){
		int[] result = new int[2];
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for(int i=0; i< arr.length-1; i++) {
			for(int j=i+1; j< arr.length;j++) {
				if(arr[i]+arr[j] == x) {
					result[0] = arr[i];
					result[1] = arr[j];
					myMap.put(result[0], result[1]);
				}
			}
			
		}
		return myMap;
	}

}
