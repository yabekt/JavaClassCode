package com.class3;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		//Say Good morning 5 times
		for(int i=1;i<=5;i++) {
			System.out.println("Good Morning");
		}
		//print 10-1
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		//print 1 to 100
		for(int i=1;i<=100;i++) {
			System.out.print(i);
		}
		//print 100 to 1
		for(int i=100;i>=1;i--) {
			System.out.print(i);
		}
		//print even number from 20 to 1
		for(int i=20;i>=1;i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//print odd numbers b/n 20 and 50
		for(int i=20;i<=50;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("************************");
		int sumAll=0;
		for(int i=0;i<=20;i+=5) {
			sumAll+=i;
		}
		System.out.println(sumAll);
		System.out.println("************************");
		int sum=0;
		for(int i=2;i<=20;i+=2) {
			sum+=i;
			
		}
		System.out.println(sum);
		System.out.println("************************");
		int sum1=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
			sum1+=i;
			}
		}
		System.out.println(sum1);
		System.out.println("************************");
		//print number from 1 to 50 except those divisible by 3
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("************************");
		Scanner scan=new Scanner(System.in);
		for(int i=1; i <= 10; i++) {
			System.out.println("Do you want to apply for credit card?");
			String ans=scan.nextLine();
			if(ans.equals("yes")) {
				break;
			}
		}
		
	}

}
