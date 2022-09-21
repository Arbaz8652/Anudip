package com.exc02;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class CharArrayMain {
	
	
	public static Map<Character, Integer> countCharacter(char[] c){
		Map<Character,Integer> ans=new HashMap<>();
		Arrays.sort(c);
		int l=c.length;
		//AAABRZ
		int count=1;
		for(int i=0; i<l-1; i++) {
			for (int j=i+1; j<l; j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			ans.put(c[i], count);
			if(count >1) {
				i+=count-1;
			}
			count=1;
		}
		if(c[l-1]!=c[l-2]) {
			ans.put(c[l-1], 1);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		char[] chararr= {'A','R','B','A','A','Z','Z'};
		Map<Character,Integer> ans=countCharacter(chararr);
		System.out.println(ans);

	}

}
