package com.class11;

public class TwoDimensional {

	public static void main(String[] args) {
		int [][] EvenOdd= {{1,2,3},{5,6,8},{10,4,9}};
		int sumEven=0;
		int sumOdd=0;
		for(int[] x:EvenOdd) {
			for(int y:x) {
			if(y%2==0) {
				sumEven+=y;
			}
			else {
				sumOdd+=y;
			}	
			}
			
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
