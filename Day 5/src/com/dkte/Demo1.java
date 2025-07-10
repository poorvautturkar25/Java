package com.dkte;

public class Demo1 {

	public static void main(String[] args) {
		// 2D Array
		//int [][] arr1 = new int [3][3];
		//int[] arr2[] = new int [3][3];
		//int arr3[][] = new int [3][3];
		//double [][] arr4 = new double [][] {{1.1,2.1,3.1},{4.1,5.1,6.1}};
		double [][] arr5 = {{1.1,2.1,3.1},{4.1,5.1,6.1}};
		
		/*for(int i=0;i<2;i++) { // i= row (2 rows)
			
			for(int j=0;j<3;j++) // j= column (3)
			{
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}*/
		
		// Ragged Array
		int [][] rarr =new int [4][];
		
		rarr[0] = new int[1];
		rarr[1] = new int[2];
		rarr[2] = new int[3];
		rarr[3] = new int[4];
		
		for(int i=0; i<rarr.length;i++) {
			for(int j=0; j< rarr[i].length; j++) 
			{
				System.out.print(rarr[i][j] + " ");
			}
			System.out.println();
		}
		
		int num=0;
		for(int i=0; i<rarr.length; i++) {
			for(int j=0; j<rarr[i].length;  j++) {
				rarr[i][j]= ++num;
			}
			System.out.println();
		}
		
		for(int i=0; i<rarr.length;i++) {
			for(int j=0; j< rarr[i].length; j++)
			{
				System.out.print(rarr[i][j] + " ");
			}
			System.out.println();
		}
		


}
}
