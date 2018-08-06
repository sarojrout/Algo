package com.demo.array;

public class BuySellStock {
/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * @param args
 */
	public static void main(String[] args) {
		int[] arr = {5,6,7,3,8};
		int maxProfit = BuySellStock.profitForAday(arr);
		System.out.println(maxProfit);
		int allTime = BuySellStock.allTimeProfit(arr);
		System.out.println("all time profit"+allTime);

	}
	
	private static int profitForAday(int[] arr) {
		int maxProfit = 0;
		int minPrice=arr[0];
		for(int i=1; i< arr.length; i++) {
			if((arr[i] - minPrice) > maxProfit) {
				maxProfit = arr[i] - minPrice;
			}
			if(arr[i] < minPrice) {
				minPrice=arr[i];
			}
		}
		return maxProfit;
	}
	
	private static int allTimeProfit(int[] arr) {
		int profit = 0;
		for(int i=1; i< arr.length; i++) {
			if(arr[i-1] < arr[i]) {
				profit+=arr[i]-arr[i-1];
			}
		}
		return profit;
	}

}
