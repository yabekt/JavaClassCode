package com.class31;

public interface Shape {
	void calculateArea();
	void calculatePerimeter();
}
class Circle implements Shape{
	int radius=4;
	double pi=3.14;
	public void calculateArea() {
		double area=pi*radius*radius;
		System.out.println("Area= "+area);
		
	}
	@Override
	public void calculatePerimeter() {
		double per=2*pi*radius;
		System.out.println("Perimeter= "+per);
		
	}
}
class Square implements Shape{
	
	int side=2;
	public void calculateArea() {
		int SquArea=side*side;
		System.out.println("Area of Square="+SquArea);
	}
	public void calculatePerimeter() {
		int SquPer=4*side;
		System.out.println("Perimeter of Square="+SquPer);
	}
	
}
