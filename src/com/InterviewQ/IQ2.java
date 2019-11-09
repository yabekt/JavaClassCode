package com.InterviewQ;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		//1 way
		int[] array= {100,-90,8787,898,0};
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		System.out.println(min);
		System.out.println(max);
		//2 way
		int[] myArray={100,-90,8787,898,0};
		int largest=myArray[0];
		int smallest=myArray[0];
		for(int i=0;i<myArray.length-1;i++) {
			if(myArray[i]>largest) {
				largest=myArray[i];
			}
			if(myArray[i]<smallest) {
				smallest=myArray[i];
			}
		}
		System.out.println("The smallest value in the array is "+smallest);
		System.out.println("The largest value in the array is "+largest);
		
		// second largest numbers
		int[] num={100,-90,8787,898,0};
		int large=num[0];
		int secondLarge=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>large) {
				secondLarge=large;
				large=num[i];
			}
			else if(num[i]>secondLarge && num[i]<large) {
				secondLarge=num[i];
			}
		
		}
		System.out.println("The 2 largest value in the array is " + secondLarge);
		System.out.println("The largest value in the array is " + large);

	}

}
