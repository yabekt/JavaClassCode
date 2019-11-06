package com.class3;

public class WhileLoopPractice {
	public static void main(String[] args) {
		int i=0;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		//print numbers 10 to 30 in 1 line
		int y=10;
		while(y<=30) {
			System.out.print(y);
			y++;
		}
		//print values 10 to 1
		int a=10;
		while(a>=1) {
			System.out.print(a);
			a--;
			
		}
		//print values 50 to 20
		int c=50;
		while(c>=20) {
			System.out.println(c);
			c--;
		}
		//print only even numbers from 1 to 20;
		int d=2;
		while(d<=20) {
			System.out.println(d);
			d+=2;
		}
		int q=1;
		while(q<=20) {
			if(q%2==0) {
				System.out.println(q);
			}
			q++;
		}
		int f=20;
		do {
			System.out.println(f);
			f+=2;
		}while(f<=50);
		
	}

}
