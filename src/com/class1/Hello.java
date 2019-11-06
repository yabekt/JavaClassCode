package com.class1;
import java.util.Scanner; 

public class Hello {
	  public static void main(String[] args){
	    Scanner comp=new Scanner(System.in);
	    System.out.println("Please enter two strings");
	    String word1=comp.nextLine();
	    String word2=comp.nextLine();
	    System.out.println("Please enter two numbers");
	    int int1=comp.nextInt();
	    int int2=comp.nextInt();
	    
	    	if((int1==int2) && (word1==word2)){
	    		System.out.println("AND");
	          }
	    	if((int1==int2) || (word1!=word2)){
	         System.out.println("OR");
	         }
	    	if(int1!=int2 && word1!=word2){
	    		System.out.println("NONE");
	    }
	  }

	}

