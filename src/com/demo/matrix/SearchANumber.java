package com.demo.matrix;

public class SearchANumber {

	public static void main(String[] args) {
		int[][] inputArr = {{1,24,3,0},{2,3,4,1},{1,23,4,5},{3,4,5,7}};
		SearchANumber.search(inputArr, 11);

	}
	
	private static void searchNumber(int[][] input, int x) {
		for(int i=0; i< input.length; i++) {
			for(int j=0; j< input[0].length; j++) {
				if(input[i][j]==x) {
					System.out.println("Found the element::"+i+" "+j);
					return;
				}if(input[i][j] > x) {
					j--;
				}else {
					i++;
				}
			}
		}
		System.out.println(x+" not found");
	}
	
	private static void search(int[][] input, int x) {
		int rowLen = input.length;
		int i =0;
		int j = rowLen-1;
		while(i < rowLen && j >=0) {
			if(input[i][j] == x) {
				System.out.println("Found the element::"+i+" "+j);
				return;
			}
			if(input[i][j] < x) {
				i++;
			}else {
				j--;
			}
		}
		System.out.println("not found");
	}

}
