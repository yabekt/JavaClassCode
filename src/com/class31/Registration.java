package com.class31;

public class Registration {
	private String email, userName,passWord;
	
	//getters
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	//setter
	public void setEmail(String emailType,String userName) {
		if(emailType.equals("@gmail.com")) {
			email=userName+emailType;
		}
		else {
			System.out.println("Not valid email type");
		}
	}
	public void setUserName(String userName,int length) {
		if(userName!="" && length>6) {
			this.userName=userName;
		}
		else {
			System.out.println("User name cannot be empty and greather than 6 characters");
		}
	}
	public void setPassWord(String passWord,int length,String userName) {
		if(passWord!="" && length>6 && passWord!=userName) {
			this.passWord=passWord;
		}
		else {
			System.out.println("Password cannot be empty and greather than 6 characters");
		}
	}
	

	

}
