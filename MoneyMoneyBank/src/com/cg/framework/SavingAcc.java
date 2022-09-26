package com.cg.framework;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalary;
	private static final float MINBAL = 500;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	public void withdraw(float accBal) {
		System.out.println("");
	}
	
	

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
