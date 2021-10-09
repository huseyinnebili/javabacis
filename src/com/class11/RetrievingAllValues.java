package com.class11;

public class RetrievingAllValues {
public static void main(String[] args) {
	
	int [][] num= {
			{11,12,13,17},   //num[row].lenght=4
			{21,22,23,16},      //num[row].lenght=3
			{31,32,33,34,17},//num[row].lenght=5
			{2,4}           //num[row].lenght=2
	};
	
	
	int rows=num.length;
	System.out.println(rows);
	
	int cols=num[2].length;
	System.out.println(cols);

	
	System.out.println("-------------------");
	
	System.out.println(num.length);
	
	System.out.println("*************");
	
	
	for(int row=0; row<num.length; row++) {
		
		for(int col=0; col<num[row].length; col++) {
			
			System.out.println("num_of_row_of _lenght = "+num[row].length);
			
			System.out.println(num[row][col]);
		}
		
		System.out.println("************");
	}
	
}
}
