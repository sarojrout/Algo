package com.demo.misc;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {2,3,8,5,11,13,16};
		int[] result = TwoSum.twoSum2(arr, 16);
		for(int num: result) {
			System.out.println(num);
		}
	}
	 public static int[] twoSum(int[] nums, int target) {
	       // int[] result = new int[2];
	       
	        for(int i=0; i<nums.length-1;i++){
	            for(int j=i+1; j<nums.length-1; j++){
	                if(nums[i]+nums[j] == target){
	                  int[] result = {i, j};
	                  return result;
	                }
	            }
	        }
	        throw new IllegalStateException("the input has no solution");
	    }
	 
	 //space complexity: o(n)
	 // time complexity: o(n)
	 public static int[] twoSum2(int[] nums, int target) {

	        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
	        for(int i = 0 ; i < nums.length ; i ++)
	            record.put(nums[i], i);

	        for(int i = 0 ; i < nums.length; i ++){

	            Integer index = record.get(target - nums[i]);
	            if(index != null && index != i){
	                int[] res = {i, index};
	                return res;
	            }

	            record.put(nums[i], i);
	        }

	        throw new IllegalStateException("the input has no solution");
	    }

}
