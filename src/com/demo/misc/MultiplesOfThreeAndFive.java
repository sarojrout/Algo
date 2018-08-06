/**
 * 
 */
package com.demo.misc;

/**
 * @author srout
 *Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class MultiplesOfThreeAndFive {

	public static void main(String[] args) {
		int result = MultiplesOfThreeAndFive.sum(1000);
		System.out.println(result);
	}
	
	public static int sum(int number) {
		int result =0;
		for(int i = 0; i< number; i++) {
			if(i%3 ==0 || i%5==0) {
				result+=i;
			}
		}
		return result;
	}
}

