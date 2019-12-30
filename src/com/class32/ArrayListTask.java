package com.class32;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<>();
		arrayList.add("yyy");
		arrayList.add("bbb");
		arrayList.add("cccc");
		arrayList.add("dddd");
		arrayList.add("ffff");
		
		//check whether the arraylist is empty or not
		arrayList.isEmpty();
		
		//check specific name in the list
		arrayList.contains("cccc");
		
		//check the size of the list
		int size=arrayList.size();
		//print
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.contains("cccc"));
		System.out.println(size);
		

	}

}
