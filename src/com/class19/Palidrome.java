package com.class19;

public class Palidrome {
	
	
	
	public String palidrome(String str) {
		
		String reverse="";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			char ch=str.charAt(i);
			
			reverse=reverse+ch;
			
		}
			
			if(reverse.equalsIgnoreCase(str)) {
				
				System.out.println(str+" is a palidrome");
				
			}else {
				
				System.out.println(str+" is not a palidrome.");
			}
		
		return str;
	}
	
	public static void main(String[] args) {
		
		
		Palidrome obj=new Palidrome();
		
		obj.palidrome("Dod");
	}

}
