package com.cg.application;

import com.cg.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private static final float charges = 10; 
	
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}
	
	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, your charges are: "+getCharges());
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
