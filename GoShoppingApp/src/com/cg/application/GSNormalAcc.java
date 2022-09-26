package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("Dear Normal User, your charges are: "+getCharges()+" "+"along with delivery charge"+getDeliveryCharge());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
