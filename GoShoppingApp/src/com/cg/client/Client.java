package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf = new GSShopFactory();
		PrimeAcc pa = new GSPrimeAcc(123,"abc",1000,true);
		NormalAcc na = new GSNormalAcc(456,"xyz",550,100);
		pa.bookProduct(pa.getCharges());
		na.bookProduct(na.getDeliveryCharge());
		pa.toString();
		System.out.println(pa);
		na.toString();
		System.out.println(na);
	}
}
