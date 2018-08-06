package com.demo.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstringBruteForce {

	
	private static int lengthOfSubstring(String s) {
		int result=0;
		for(int i=0; i<s.length()-1;i++) {
			for(int j=i+1; j<s.length();j++) {
				if(hasUniqueChar(s,i,j)) {
					result = Math.max(result, j-i);
				}
			}
		}
		return result;
	}
	private static boolean hasUniqueChar(String s, int start, int end) {
		Set<Character> set = new HashSet<Character>();
		
		for(int i=start;i<end;i++) {
			if(set.contains(s.charAt(i))) {
				return false;
			}
			set.add(s.charAt(i));
		}
		return true;
	}
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
	 public static int lengthOfLongestSubstring1(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	 public static void main(String[] args) {
			String s ="pwwkew";
			System.out.println(LengthOfLongestSubstringBruteForce.lengthOfLongestSubstring1(s));

		}

}
