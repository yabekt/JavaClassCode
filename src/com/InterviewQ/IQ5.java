package com.InterviewQ;

public class IQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="Welcome to the Java class";
		/*Step1: split
		 *Step2: for loop and use decrement to print value
		 * 
		 * */
		//1
		String reversed="";
		String [] str=given.split("\\s");
		for(int j=str.length-1;j>=0;j--) {
			reversed+=str[j]+" ";
		}
		System.out.println(reversed);
		
		String str2="susamis sularin akisi gibi";
        char [] str1=str2.toCharArray();
        for (int i = str1.length-1; i >=0 ; i--) {
            System.out.print(str1[i]);
        }
        System.out.println();
        System.out.println("============");
        //Reverse a string word by word?
        
        String[]str3=str2.split(" ");
        for (int i = str3.length-1; i >=0 ; i--) {
            System.out.print(str3[i]+" ");

	}

}
}
