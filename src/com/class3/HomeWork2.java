package com.class3;
import java.util.Scanner;

public class HomeWork2 {
	/* You need to ask user to pay for coffee
	 * you need to keep asking user to pay for until entered 
	 * price equal to =5
	 * After user paid then say "Enjoy your coffee"
	 */
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int coff;
	System.out.println("Pay for coffee");
	coff=scan.nextInt();
	while(coff!=5) {
		System.out.println("Pay for coffee");
		coff=scan.nextInt();

	}
	System.out.println("Enjoy your coffee");

}
}