package com.class3;

public class EvenOrOdd {

	public static void main(String[] args) {

		int a = 12;
		int b = 4;
		int mod = a % b;

		/*
		 * if (mod != 0) { 
		 * System.out.println("Odd"); 
		 * } else {
		 * System.out.println("Even"); }
		 */

		if (mod == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
