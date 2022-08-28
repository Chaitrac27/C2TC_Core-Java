package com.cg.classandobject;

public class Balance {

	private String name;
	private double balance;

	public Balance(String name, double balance) {
	super();
	this.name = name;
	this.balance = balance;
	}
	public void show() {
	if(balance < 0)
	System.out.println(("your balance is low "));
	System.out.print("-->");
	System.out.println(name + ": $" + balance);
}
}