package com.service;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AcceptSudoku {

	public int[][] getSudoku(int[][] sud) throws IOException  {
	
		int[][] sudoku=new int[9][9];
		String[] row=new String[9];
		RandomAccessFile rf=new RandomAccessFile("Sudoku.txt", "rw");
		String s=null;
		int j=0, size=0;
		while((s=rf.readLine())!=null) {
			row=s.split(" ");
			size = row.length;
		    for(int i=0; i<size; i++) {
		         sudoku[j][i] = Integer.parseInt(row[i]);
		    }
		    
			j++;
			s=null;	
		}
		rf.close();
		return sudoku;
		
		
		
	}
}