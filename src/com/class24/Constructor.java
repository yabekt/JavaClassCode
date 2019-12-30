package com.class24;

public class Constructor {
	
	private Constructor() {
		System.out.println("Hello");
	}
	public Constructor(String str) {
		System.out.println("Hi");
	}
//	protected Constructor() {
//		System.out.println("Bye");
//	}
//	Constructor(){
//		System.out.println("hiii");
//	}
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
	}

}
