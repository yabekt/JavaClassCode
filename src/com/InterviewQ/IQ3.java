package com.InterviewQ;

public class IQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello 677677889 &*^^, welcomegkkkj !!!";
		str= str.replaceAll("^[A-Za-z]", "");
		System.out.println(str.length());
		
		//IQ4
		
		String str1="Today is very cold outside";
		String str2=str1.substring(0,5);
		System.out.println(str2);
		//step1: split based on the space-return array of string
		//step2: find the length of the array
		String[] words=str1.split(" ");
		System.out.println(words.length);
		

	}

}
