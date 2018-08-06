package com.demo.array;

import java.util.Arrays;

public class Candy {

	public static void main(String[] args) {
		int[] arr = {1,0,2};
		int result = Candy.candy(arr);
		System.out.println(result);
	}
	
	private static int candy(int[] ratings) {
		int[] candies = new int[ratings.length];
		Arrays.fill(candies, 1);
		for(int i=1; i< candies.length; i++) {
			if(ratings[i] > ratings[i-1]) {
				candies[i] = candies[i-1]+1;
			}
			
		}
		for (int i=candies.length-2; i >=0; i--) {
			if(ratings[i]>ratings[i+1]) {
				candies[i]=Math.max(candies[i], (candies[i+1]+1));
			}
		}
		int sum=0;
		for(int candy: candies) {
			sum+=candy;
		}
		return sum;
	}

}
