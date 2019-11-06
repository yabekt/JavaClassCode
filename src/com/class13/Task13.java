package com.class13;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr=new String[5];
		//System.out.println("Enter the day:");
		String res = "Sunday";
		for (int i=res.length()-1;i>=0;i--) {
			System.out.print(res.charAt(i));
			
		}
		System.out.println();
		
		String str="Hello";
		if(!str.isEmpty()) {
			if(str.length()%2!=0 && str.length()>3) {
				int ave=str.length()/2;
				System.out.println(str.charAt(ave));
			}
		}
		System.out.println("========");
		String str1="Hell how are you?";
		System.out.println(str1.replace('e', 'z'));
		System.out.println("=========");
		//Regular Expressions
		String str2="12345Hell567%@#890o888";
		System.out.println(str2.replaceAll("[0-9]", ""));
		System.out.println(str2.replaceAll("[a-zA-Z]", ""));
		System.out.println(str2.replaceAll("\\W", ""));
		

	}

}
