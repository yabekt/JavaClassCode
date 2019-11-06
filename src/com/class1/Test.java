package com.class1;

public class Test {
	public static void main(String[] args) {
		  /*for(int h=0;h<=12;h++) {
			  //System.out.println("Inner loop");
			  for(int m=0;m<60;m++) {
				  if(m<10) {
					  System.out.println(h+":0"+m);
				  }else {
				  System.out.println(h+":"+m);
				  }
			  }
		  }*/
		  System.out.println("-----------------");
		  for(int i=1;i<=5;i++) {
			  for(int j=1;j<=9;j++) {
				  System.out.print(j);
			  }
			  System.out.println();
		  }
		  System.out.println("-----------------");
		  for(int i=1;i<=5;i++) {
			  for(int j=5;j>=1;j--) {
				  System.out.print(j);
			  }
			  System.out.println();
		  }
		  System.out.println("-----------------");
		  for(int i=5;i>=1;i--) {
			  for(int j=1;j<=5;j++) {
				  System.out.print(i);
			  }
			  System.out.println();
		  }
		  System.out.println("-----------------");
		  for(int i=1;i<=5;i++) {
			  for(int j=1;j<=i;j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		  System.out.println("-----------------");
		  for(int i=1;i<=5;i++) {
			  for(int j=1;j<=i;j++) {
				  System.out.print(j);
			  }
			  System.out.println();
		  }
		  System.out.println("-----------------");
		  for(int i=1;i<=9;i++) {
			  for(int j=1;j<=i;j++) {
				  System.out.print(i);
			  }
			  System.out.println();
		  }
		  System.out.println("-----------------");
		  for(int i=1;i<=5;i++) {
			  for(int j=1;j<=i;j++) {
				  System.out.print("*");
			  }
			  System.out.println();  
		  }
		  for(int i=4;i>=1;i--) {
			  for(int j=1;j<=i;j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		  
		  
	}

}
