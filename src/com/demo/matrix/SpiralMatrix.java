package com.demo.matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] inputArr= {{1,2,3},{4,5,6},{7,8,9}};
		SpiralMatrix.printArr(inputArr);

	}
	
	private static void printArr(int[][] input) {
		int rowLength = input.length;
		int colLength = input[0].length;
		int topMostRow =0;	
		int bottomMostRow = rowLength-1;
		int leftMostCol =0;
		int rightMostCol = colLength-1;
		int dir = 0;
		while(topMostRow <= bottomMostRow && leftMostCol <= rightMostCol) {
			if(dir==0) {
				for(int i=leftMostCol; i<=rightMostCol;i++) {
					System.out.println(input[topMostRow][i]);
					
				}
				topMostRow++;
				dir=1;
			}
			if(dir==1) {
				for(int i=topMostRow; i<=bottomMostRow; i++) {
					System.out.println(input[i][rightMostCol]);
				}
				rightMostCol--;
				dir=2;
			}
			if(dir ==2) {
				for(int i=rightMostCol;i>=leftMostCol;i--) {
					System.out.println(input[bottomMostRow][i]);
				}
				bottomMostRow--;
				dir=3;
			}
			if(dir==3) {
				for(int i=bottomMostRow;i>=topMostRow;i--) {
					System.out.println(input[i][leftMostCol]);
				}
				leftMostCol++;
				dir=0;
			}
		}
	}

}
