package com.class35;

import java.util.HashMap;

public class MapTask {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Apple");
		map.put(4, "Toyota");
		map.put(5, "Linkdein");
		map.put(5, "Google");
		map.put(4, "Apple");
		
		boolean flag=map.isEmpty();
		if(!flag) {
			int size=map.size();
			System.out.println(size);
		}
		map.replace(4, "Cyber Soft");
		System.out.println(map);
		map.remove(5);
		System.out.println(map);
		

	}

}
