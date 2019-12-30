package com.class24;

public class Test {

	public static void main(String[] args) {
		child1 ch1=new child1();
		System.out.println(ch1.race);
		System.out.println(ch1.hariColor);
		System.out.println(ch1.eyeColor);
		ch1.sing();
		ch1.code();
		System.out.println(child1.race);
		
		Parent par1=new Parent();
		System.out.println(par1.hariColor);
		System.out.println(par1.eyeColor);
		System.out.println(Parent.race);
		par1.sing();
		//par1.Code();

	}

}
