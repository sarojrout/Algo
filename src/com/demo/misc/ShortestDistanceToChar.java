package com.demo.misc;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceToChar {

	public static void main(String[] args) {
		String s = "loveleetcode";
		int[] result = ShortestDistanceToChar.calculateShortestDistance(s, 'c');
		for(int i =0; i< result.length;i++) {
			System.out.println(i);
		}

	}
	
	private static int[]  calculateShortestDistance(String s, char c) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) == c) {
				list.add(i);
			}
		}
		Integer[] arr = list.toArray(new Integer[list.size()]);
		int[] res = new int[s.length()];
		for(int i=0; i< s.length(); i++) {
			if(s.charAt(i) != c) {
				res[i] =  getMinDistance(arr, i);
			}
		}
		return res;
	}
	
	private static int getMinDistance(Integer[] arr, int current) {
		int left = 0;
		int right = arr.length-1;
		int mid = left+(right-left)/2;
		if(arr[mid] > current) {
			right = mid;
		}else {
			left = mid;
		}
		return Math.abs(Math.min(arr[right] - current, current - arr[left]));
	}

}
