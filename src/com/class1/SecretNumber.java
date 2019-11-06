package com.class1;

import java.util.Scanner;

public class SecretNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the secret number");
		int num=scan.nextInt();
		int secNum=10;
		while(num<=20) {
			if(num>secNum) {
				System.out.println("Too large");
			}else if(num<10) {
				System.out.println("Too small");
			}else {
				System.out.println("Congradulation!!. You got it!");
			}
			
		}
		
	}
}


