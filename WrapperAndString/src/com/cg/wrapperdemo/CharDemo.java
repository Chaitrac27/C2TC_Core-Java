package com.cg.wrapperdemo;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name:");
		String input = scanner.nextLine();
		
		int upperCharCount = 0;
		int lowerCharCount =0;
		
		if(!input.isEmpty()) {
			for(char ch:input.toCharArray()) {
			if(!Character.isDigit(ch) && Character.isAlphabetic(ch)) {
				if(Character.isUpperCase(ch)) {
					upperCharCount++;
				}
				else
				{
					lowerCharCount++;
				}
			}
			}
			System.out.println("Uppercase Character:"+upperCharCount);
			System.out.println("Lowercase Character:"+lowerCharCount);
		}
		System.out.println("End of Program....");
		scanner.close();
	}
}
