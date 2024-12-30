package edu.stpeters;

public class matrix1 {

	public static void main(String[] args) {

		int[][] mat = { 
				{ 1, 2, 3 }, 
				{ 3, 4, 5,6,9,77,88 },
				{ 6, 7 }
				};
		
		for(int rows=0;rows<3;rows++) {
			for(int cols=0;cols<mat[rows].length;cols++) {
				
				System.out.print(mat[rows][cols]+" ");
			
			}
			System.out.println();
			
		}

	}
}