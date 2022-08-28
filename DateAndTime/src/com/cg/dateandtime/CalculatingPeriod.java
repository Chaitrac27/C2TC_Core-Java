package com.cg.dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculatingPeriod {

public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(1947,Month.AUGUST , 15);
		System.out.println(start);
		LocalDate end = LocalDate.now();
		System.out.println(end);
		
		Period period = start.until(end);
		
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+period.getYears());
}
}
