package com.service;

public class Sudoku {

	public static void printSudoku(int[][] sudoku) {
		for (int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(j%3==0 && j!=0) {
					System.out.print("| ");
				}
				
				System.out.print(sudoku[i][j]+" ");
			}
			System.out.println();
			if((i+1)%3==0 && i!=8) {
				System.out.println("----------------------");
			}
			
		}
	}
	
	
	//Method to check if the number is present in the row
	public static boolean isNumInRow(int[][] arr, int num, int row) {
		for(int i=0; i<9; i++) {
			if(arr[row][i]==num){
				return true;
			}					
		}
		return false;
	}
	
	
	//Method to check if the num is exist in the colomn
	public static boolean isNumIncol(int[][] arr, int num, int col) {
		for(int i=0; i<9; i++) {
			if(arr[i][col]==num){
				return true;
			}					
		}
		return false;
	}
	
	
	//Method to check is the number is present in the 3X3 box
    public static boolean isNumIngrid(int[][] arr, int num, int row, int col ) {
		int localRow=row -row%3;
		int localCol=col -col%3;
		for(int i=localRow; i<localRow+3; i++ ) {
			for(int j=localCol; j<localCol+3; j++) {
				if(arr[i][j]==num) {
					return true;
				}
			}
		}
		return false;
	}
    
    
    //Mehtode to check all three conditions
    public static boolean isNumValid(int[][] grid, int num, int row, int col) {
    	if(!isNumIncol(grid, num, col) && !isNumInRow(grid, num, row) && !isNumIngrid(grid, num, row, col)) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    //Method to solve sudoku
    public static boolean solveSudoku(int[][] sud) {
    	for(int i=0; i<9; i++) {
		   for(int j=0; j<9; j++) {
			   if(sud[i][j]==0) {
				   for(int ntry=1; ntry<=9; ntry++) {
					   if(isNumValid(sud, ntry, i, j)) {
						   sud[i][j]=ntry;
						   
						   if(solveSudoku(sud)) {
							   return true;
						   }else {
							   sud[i][j]=0;
						   }
					   }
				   }
				   return false;
			   }
		   }
	   }
	   return true;
   }
}
