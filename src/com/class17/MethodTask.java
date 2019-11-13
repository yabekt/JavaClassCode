package com.class17;

public class MethodTask {
	
	void num(int n1,int n2) {
		if(n1>n2) {
			System.out.println(n1+" is greater than "+n2);
		}
		else {
			System.out.println(n2+" is greater than "+n1);
		}
	}
	void num1(int n) {
		if(n%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("It is odd");
		}
	}
	void palend(String s1,String s2) {
		int length;
		length=s1.length();
		for(int i=length-1;i>=0;i--) {
			s2+=s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("It is palendrome");
		}
		else {
			System.out.println("It is not palendrome");
		}
	}
	public static void main(String[] args) {
		MethodTask task=new MethodTask();
		task.num(1, 2);
		
		MethodTask task2=new MethodTask();
		task2.num1(1);
		
		MethodTask task3=new MethodTask();
		task3.palend("civic", "");
	}

}
