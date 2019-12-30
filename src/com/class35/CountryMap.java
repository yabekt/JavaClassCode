package com.class35;

import java.util.*;
public class CountryMap {

	public static void main(String[] args) {
		Map<String,String> map=new TreeMap<>();
		map.put("USA", "DC");
		map.put("Canada", "Toronto");
		map.put("Ethiopa", "Addis Ababa");
		map.put("China", "Bejing");
		
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+":"+map.get(key));
		}
		Iterator<String> itKey=keys.iterator();
		while(itKey.hasNext()) {
			String mapKey=itKey.next();
			String mapValue=map.get(mapKey);
			System.out.println(mapKey+"_"+mapValue);
		}

	}

}
