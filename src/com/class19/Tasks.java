package com.class19;

public class Tasks {
	
	public static void main(String[] args) {
		Tasks obj=new Tasks();
		String res=obj.CreateEmail("yared", "tibebu", "gmail");
		System.out.println(res);
				
	}
	
	
	String CreateEmail(String userName,String lastName,String emailType) {
		String email=userName+lastName+"@"+emailType+".com";
		return email;
	}

}
