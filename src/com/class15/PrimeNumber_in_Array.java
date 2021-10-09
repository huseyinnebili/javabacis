package com.class15;

import java.util.Scanner;

public class PrimeNumber_in_Array {

	static Scanner scan;
	static int sum;
	static int sum_2;
	static String capital;

	public static void main(String args[]) {

		scan = new Scanner(System.in);

		int num = 9;
//		System.out.println("Please enter 10 numbers");
//		int[] num = new int[10];
//
//		for (int i = 0; i < num.length; i++) {
//
//			num[i] = scan.nextInt();
//		}
//
//		for (int i = 0; i < num.length; i++) {
//			int count = 0;
//
//			if (num[i] == 0 || num[i] == 1) {
//
//				continue;
//			
		
		if(num<2) {
			
			System.out.println(num+" is not prime number.");
		}else {
		boolean isPrime = true;
		for (int j = 2; j < num - 1; j++) {

			if (num % j == 0) {

				isPrime = false; // count = count + 1;
				break;
			}
		}

		if (isPrime) {

			System.out.println(num + " is  a prime number.");
		} else {

			System.out.println(num + " is not  a prime number.");
		}

		}
}}
