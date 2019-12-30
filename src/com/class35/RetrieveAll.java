package com.class35;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetrieveAll {

	public static void main(String[] args) {
		//create a map of a person(name,lastname,address,city,state)
		Map<String,String> personMap=new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		//how to retrieve a specific value
		String value=personMap.get("State");
		System.out.println(value);
		//how to retrieve all keys and all values?
		Set<String> keys=personMap.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		for(String key:keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		System.out.println("=========");
		Iterator<String> KeysItr=keys.iterator();
		while(KeysItr.hasNext()) {
			System.out.println(KeysItr.next());
		}
		
		System.out.println("Print all the values");
		Collection<String> values=personMap.values();
		Iterator<String> it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// how can I retrieve and print values key:value
		System.out.println("Print keys and values using iterator");
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			//System.out.println(keysIterator.next()+":"+personMap.get(keysIterator.next()));
			String mapKey=keysIterator.next();
			String mapValue=personMap.get(mapKey);
			System.out.println(mapKey+"_"+mapValue);
		}
		


	}

}
