package com.demo.array;

import java.util.Arrays;

public class ZigZagArrangement {
	public void rearrange(int input[]) {
        boolean isLess = true;
        for (int i = 0; i < input.length - 1; i++) {
            if(isLess) {
                if (input[i] > input[i+1]) {
                    swap(input, i, i+1);
                }
            } else {
                if (input[i] < input[i+1]) {
                    swap(input, i, i+1);
                }
            }
            isLess = !isLess;
        }
    }

    private void swap(int input[], int i, int j) {
        int t = input[i];
        input[i] = input[j];
        input[j] = t;
    }

    public static void main(String args[]) {
        int input[] = {4, 3, 2, 6, 7, 1, 9};
        ZigZagArrangement zza = new ZigZagArrangement();
        zza.rearrange(input);
        Arrays.stream(input).forEach(i -> System.out.print(i + " "));
    }
    
    void zigzag(int[] arr) {
    Arrays.sort(arr);
    for(int i=1; i< arr.length-1; i++) {
    	if(arr[i] > arr[i+1]) {
    		int temp = arr[i];
    		arr[i]=arr[i+1];
    		arr[i+1]=temp;
    	}
    }
    	
    }
}
