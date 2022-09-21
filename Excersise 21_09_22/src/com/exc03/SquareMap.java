package com.exc03;

import java.util.HashMap;
import java.util.Map;

public class SquareMap {

	
	public static Map<Integer, Integer> getSquare(int[] arr){
		Map<Integer, Integer> ans=new HashMap<>();
		for(int a:arr) {
			ans.put(a,a*a);
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(getSquare(arr));

	}

}
