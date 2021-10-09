package com.class17;




public class Application {
	public static void main(String[] args) {
		
		
		Calculator operations = new Calculator();
		
		int x=133, y=100;
		int d=operations.sum(x,y);
		System.out.println("Sum ="+d);
		
		int e=operations.sub(x,y);
		System.out.println("sub= "+e);
		
		int f=operations.mult(x,y);
		System.out.println("mult ="+f);
		

		int h=operations.div(x,y);
		System.out.println("div= "+h);
	}
	
}
	

