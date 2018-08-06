/**
 * 
 */
package com.demo.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author srout
 *
 */
public class FindPairOfNumbers {
	
	public static void main(String[] args) {
		int[] arr = {1,3,2,6,2,5};
		Map<Integer, Integer> result = FindPairOfNumbers.findPair(arr, 8);
		System.out.println(result);
	}
	
	private static Map<Integer, Integer> findPair(int[] arr, int target){
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for(int i=0; i< arr.length-1; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					result[0] = arr[i];
					result[1]=arr[j];
					myMap.put(result[0], result[1]);
				}
			}
			
		}
		return myMap;
	}

}
