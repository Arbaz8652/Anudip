package com.exc01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	
	//Creating a methode to accept An HashMap
	
	public static List<String> getValue(HashMap<Integer, String> hI) {
		List<String> str=new ArrayList<>();
		for(String s:hI.values()) {
			str.add(s);
		}
		Collections.sort(str);
		return str;
	}
	
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> stdWithRollNo = new HashMap<Integer,String>();
		stdWithRollNo.put(21, "Joseph");
		stdWithRollNo.put(39, "Tony");
		stdWithRollNo.put(45, "Steave");
		stdWithRollNo.put(26, "Amber");
		stdWithRollNo.put(12, "Tom");
		stdWithRollNo.put(85, "Harley");
		List<String> ans=getValue(stdWithRollNo);
		System.out.println(ans);
	     

	}

}
