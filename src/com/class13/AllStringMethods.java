package com.class13;
import java.util.Scanner;
public class AllStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your class day: ");
		String day=scan.nextLine();
		
		if(day.equalsIgnoreCase("Saturday")) {
			System.out.println("Saturday is your java class");
		}else if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("Sunday is your Git class");
		}else if(day.equalsIgnoreCase("Tuesday")) {
			System.out.println("Tuesday is your SDLC class");
		}else if(day.equalsIgnoreCase("Thrusday")) {
			System.out.println("Thrsday is your Manual Testing class");
		}else {
			System.err.println("Invalid Entry");
		}
		
			
		}

	}


