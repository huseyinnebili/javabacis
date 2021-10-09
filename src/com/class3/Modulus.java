package com.class3;

public class Modulus {

	public static void main(String[] args) {

		int a=10;
		int b=4;
		
		int div=a/b;
		System.out.println(div);//3 or 3.3
		
		
		//modulus operator
		
		int mod =a%b;
		System.out.println(mod);
		//%=Bolmeden sonra kalani gosterir
		
		int q=47;
		int w=5;
		System.out.println(q%w);
	
		//Parentheses,exponents,multiplication/division,modulus,addition/subtraction
	
		int e=5+4*6;
		System.out.println(e);
		
		int x=(22+9)%7;
		System.out.println(x);
		
		int y =20+ -3*5/8;
		System.out.println(y);
		
		int z=5+15/3*2-8%3;//(5+10-2)
		System.out.println(z);
		
	}

}
