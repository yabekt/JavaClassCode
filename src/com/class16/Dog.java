package com.class16;

public class Dog {
	String breed,name;
	int age;
	
	void bark() {
		System.out.println("The "+ breed +" " +name + " barks");
	}
	void age() {
		System.out.println("The "+breed+" "+ name+ " is "+age+" years old");
	}
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.breed="Husky";
		d1.name="Titi";
		d1.age=4;
		
		Dog d2=new Dog();
		d2.breed="Bulldog";
		d2.name="Boby";
		d2.age=5;
		
		d1.bark();
		d1.age();
		
		d2.bark();
		d2.age();
	}

}
