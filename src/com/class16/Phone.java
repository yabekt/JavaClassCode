package com.class16;

public class Phone {
	
	String brand,os;
	
	void brand1() {
		System.out.println("My phone is "+brand);
	}
	void os1() {
		System.out.println("My phone operating system is "+os);
	}
	public static void main(String[] args) {

	Phone name=new Phone();
	name.brand="Iphone";
	name.os="Android";
	name.brand="Nokia";
	name.brand1();
	name.os1();
	
}
}
