package com.class1;

public class ExceptionTest {

	public static void main(String[] args) {
		int a=10, b=0, result;
	     
	     result = a/b;
	     try{
	     System.out.println(result);
	     }catch(ArithmeticException e){
	       System.out.println(e.getMessage());
	     }

	}

}
