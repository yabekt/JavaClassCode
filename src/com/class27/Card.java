package com.class27;

public class Card {
	
	public void chargeInterest() {
		System.out.println("Card charge 25% of interest");
	}
	public void creditLimit() {
		System.out.println("Card limit is 5000");
	}
}
class AX extends Card{
	public void creditLimit() {
		System.out.println("Credit limit of the AX card is 25000");
	}
	
}
class MC extends Card{
	public void creditLimit() {
		System.out.println("Credit limit of the MC card is 15000");
	}
	public void cashBack() {
		System.out.println("MC gives cash back of 3%");
	}
}
class Visa extends Card{
	public void creditLimit() {
		System.out.println("Credit limit of the Visa card is 10000");
	}
}