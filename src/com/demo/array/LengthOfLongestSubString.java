package com.demo.array;

public class LengthOfLongestSubString {

	public static void main(String[] args) {
		String s = "aabcbd";
		System.out.println(LengthOfLongestSubString.maxLength(s));

	}
	
	private static int maxLength(String s) {
		char[] ca = s.toCharArray();
		 if (s.length()<2) return s.length();
		int start=0,maxLength=1;
		for(int i=0; i< ca.length;i++) {
			int j=start;
			for(; j<i;j++) {
			if(ca[i]==ca[j]) {
				break;
			}
			
			}
			if(j<i) {
				start=j+1;
			}
			maxLength = Math.max(i-start+1, maxLength);
		}
		return maxLength;
	}
	
	

}
