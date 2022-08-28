package com.cg.fundamentals;

public class PrefixPostfix {

	public static void main(String[] args) {

		int numA = 5;
		int numB = 10;
		int numC = 0;
		numC = --numC + numB--;
		System.out.println(numA);
		System.out.println(numC);
		System.out.println(numB);
	}

}
