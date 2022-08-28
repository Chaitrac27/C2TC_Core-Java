package com.cg.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParsingDate {

public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input = scanner.nextLine();
		
		LocalDate enteredDate = LocalDate.parse(input,formatter);
		
		System.out.println("Entered Date:"+enteredDate);
		scanner.close();
}
}
