package com.class27;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//type reference variable=object is created
		Card card=new AX();
		card.chargeInterest();
		card.creditLimit();
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card[] cardArray= {card,card1};
		Card[] cardArray1= {new MC(),new AX(),new Visa()};
		
		for(Card c:cardArray1) {
			c.creditLimit();
		}
	}

}
