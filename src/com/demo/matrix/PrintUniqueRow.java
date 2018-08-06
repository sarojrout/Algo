package com.demo.matrix;

import java.util.HashSet;

public class PrintUniqueRow {
	
	private static void printArray(int[][] input, int row, int col) {
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i< row; i++) {
			String s = "";
			for(int j=0; j< col; j++) {
				s+=String.valueOf(input[i][j]);
				if(!set.contains(s)) {
					set.add(s);
					System.out.println(s);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[][] inputArr = {{1,0,1,1,1},{0,1,0,1,0},{0,1,0,1,0},{1,0,0,1,0}};
		PrintUniqueRow.printArray(inputArr, 4, 5);
	}

}
