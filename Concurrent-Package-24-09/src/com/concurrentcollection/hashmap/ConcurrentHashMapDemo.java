package com.concurrentcollection.hashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo{
	
	public static void main(String[] args) {
		
		//this is thread safe
		ConcurrentHashMap<Integer, String> hm=new ConcurrentHashMap<>();
		
		hm.put(1, "Arbaz");
		hm.put(2, "SRK");
		hm.put(3, "Aamir");
		hm.put(4, "Salman");
		hm.put(5, "Khan");
		
		hm.remove(4,"Salman");
		
		hm.putIfAbsent(4, "Don");
		
		hm.replace(2, "SRK", "ShahRukhKhan");
		
		System.out.println(hm);
	}
	

}
