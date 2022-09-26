package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL =500; 
	
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float charges) {
		System.out.println("Dear Saving Account User, your Account Balance is: "+getAccBal());
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
}
