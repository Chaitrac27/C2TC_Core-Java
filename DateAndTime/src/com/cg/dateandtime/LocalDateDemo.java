package com.cg.dateandtime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate independenceDay = LocalDate.of(1947,Month.AUGUST , 15);
		System.out.println("Independence:"+independenceDay);
		System.out.println("Today:"+currentDate);
		System.out.println("Tomorrow:"+currentDate.minusDays(1));
		System.out.println("Last Month:"+currentDate.plusMonths(1));
		System.out.println("Is Leap?:"+currentDate.isLeapYear());
		System.out.println("Number of Days in the Month:"+currentDate.lengthOfMonth());
		
}
}
