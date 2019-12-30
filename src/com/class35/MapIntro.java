package com.class35;

import java.util.HashMap;

public class MapIntro {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		
		System.out.println(map);
		//how to verify if there any elements inside map
		boolean flag=map.isEmpty();
		if(!flag) {
			int size=map.size();
			System.out.println(size);
		}
		
	}

}
