package com.InterviewQ;

public class IQ {

	public static void main(String[] args) {
		// Swap two numbers without using temp value
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
		
		System.out.println("*******");
		String str1="Hello";
		String str2="Bye";
		
		str1=str1+str2;//HelloBye
		str2=str1.substring(0,5);//Hello
		str1=str1.substring(5);
		System.out.println("The value of str1="+str1);
		System.out.println("The value of str2="+str2);
		
		String str3="Hello";
		String str4="Welcome";
		
		str3=str3+str4;//HelloWelcome
		str4=str3.substring(0,str3.length()-str4.length());//Hello
		str3=str3.substring(str4.length());
		System.out.println("The value of str3="+str3);
		System.out.println("The value of str4="+str4);

	}

}
