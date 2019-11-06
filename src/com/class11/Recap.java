package com.class11;

public class Recap {
	public static void main(String[] args) {
		int [] arr= {2,3,5,7};
		for(int ar: arr) {
			//System.out.println(ar);
		}
		String [] cars= {"Toyota","BMW","Honda","Inifinit","Accura","Mazda"};
		for(String ele:cars) {
			//System.out.println(ele);
		}
		int [] x= {2,3,4,5,6};
		int sum=0;
		for(int y:x) {
			sum+=y;
			//System.out.println(sum);
		}
		String [] cou= {"USA","Ethiopia","Zambia"};
		cou [0]="DC";
		cou [1]="AA";
		cou [2]="Lusaka";
		for (String capicity:cou) {
			System.out.println(capicity);
			
		}
		String [] [] td=new String [2][3];
		td [0][0]= "aaa";
		td [0][1]="bbb";
		td [0][2]="ccc";
		td [0][3]="ddd";
		
	}

}
