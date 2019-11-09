package com.InterviewQ;

public class IQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=0;
		b=1;
		for(int i=0;i<10;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
