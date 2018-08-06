package com.demo.misc;

import java.util.ArrayList;
import java.util.List;

public class FindLargestPrime {

	public static void main(String[] args) {
		int result = FindLargestPrime.largestPrimeFactor(3456);
		System.out.println(result);

	}

	public static int largestPrimeFactor(int number) {
		int i;
		int copyOfInput = number;
		for (i = 2; i <= copyOfInput/2; i++) {
			if (copyOfInput % i == 0) {
				copyOfInput /= i;
				i--;
			}
		}
		return i;
	}
}
