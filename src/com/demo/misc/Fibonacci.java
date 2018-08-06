package com.demo.misc;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		int result = getEvenFib(10);
		System.out.println(result);
		
		

	}

	private static int getEvenFib(int n) {
		  int a;
		  int b = 0;
		  int c = 1;
		  int sum = 0;
		  for (int i = 0; i < n; i++) {
		   a = b;
		   b = c;
		   c = a + b;// c is fib number
		   if (c % 2 == 0) {
		    sum += c;
		   }

		  }

		  return sum;

		 }
	
	
	 static int evenFibSum(int limit)
	    {
	        if (limit < 2)
	            return 0;
	     
	        // Initialize first two even prime numbers
	        // and their sum
	        long ef1 = 0, ef2 = 2;
	        long sum = ef1 + ef2;
	     
	        // calculating sum of even Fibonacci value
	        while (ef2 <= limit)
	        {
	            // get next even value of Fibonacci sequence
	            long ef3 = 4 * ef2 + ef1;
	     
	            // If we go beyond limit, we break loop
	            if (ef3 > limit)
	                break;
	     
	            // Move to next even number and update sum
	            ef1 = ef2;
	            ef2 = ef3;
	            sum += ef2;
	        }
	     
	        return(int) sum;
	    }
	 
	 
//	 private static int calcSumFibo(int n) {
//		 int[] evenNumbers = getEvenNumbers(n);
//	 }
	 private static int[] getEvenNumbers(int n) {
		 int[] newArr = new int[n];
		 int count = 0;
		 for(int i=0; i<=n; i++) {
			 if(i%2 ==0) {
				 newArr[count] = i;
				 count++;
			 }
		 }
		 return newArr;
		
	 }
}
