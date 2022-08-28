package com.cg.fundamentals;

public class SwitchStringExample {

	public static void main(String[] args) {
	
		String currentDay="Thursday";
		switch(currentDay) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		System.out.println("boring day");
		case "Thursday":
		System.out.println("getting better");
		break;
		case "Friday":
		System.out.println("much better");
		case "Saturday":
		case "Sunday":
	}
	}

}
