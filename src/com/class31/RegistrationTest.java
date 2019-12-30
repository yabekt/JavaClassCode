package com.class31;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration reg=new Registration();
		reg.setUserName("yabek", 7);
		String userNm=reg.getUserName();
		System.out.println(userNm);
		
		reg.setEmail("@gmail.com", userNm);
		String EmailAdd=reg.getEmail();
		System.out.println(EmailAdd);
		
		reg.setPassWord("yeyeye43", 7, userNm);
		String Passwd=reg.getPassWord();
		System.out.println(Passwd);

	}

}
