package com.demo.array;

public class TrappingWater {

	public static void main(String[] args) {
		int[] arr= {7,1,4,0,2,8,6,3,5};
		int result = TrappingWater.trap(arr);
		System.out.println(result);

	}

	private static int trap(int[] arr) {
		int left=0;
		int right = arr.length-1;
		int left_max = 0, right_max=0;
		int totalTrapped=0;
		while(left < right) {
			if(arr[left] < arr[right]) {
				if(arr[left] >= left_max) {
					left_max = arr[left];
				}else {
					totalTrapped+=left_max-arr[left];
					left++;
				}
			}else {
				if(arr[right] >=right_max) {
					right_max=arr[right];
				}else{
					totalTrapped += right_max-arr[right];
					right--;
				}
			}
		}
		return totalTrapped;
	}
}
