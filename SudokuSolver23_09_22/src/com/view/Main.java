package com.view;

import java.io.IOException;

import com.service.AcceptSudoku;
import com.service.Sudoku;

public class Main {

	
	public static void main(String[] args) throws IOException {

		AcceptSudoku a=new AcceptSudoku();
		int[][] su=new int[9][9];
		
		//Getting sudoku from the File
		su=a.getSudoku(su);
		
		System.out.println("   Unsolved Sudoku\n======================");
		//Printing Unsolved Sudoku
		Sudoku.printSudoku(su);
		System.out.println("======================\n   Sudoku is Solved\n======================");
		//Solve Sudoku
		if(Sudoku.solveSudoku(su)) {
			Sudoku.printSudoku(su);
		}else {
			System.out.println("It Cant be solved");
		}
		
	}

}
