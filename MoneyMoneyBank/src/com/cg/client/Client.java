package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(101,"Chaitra",700,true);
		CurrentAcc ca = new MMCurrentAcc(105,"Chandana",1500,20000);
		sa.deposite(sa.getAccBal());
		ca.deposite(ca.getAccBal());
		sa.toString();
		System.out.println(sa);
		ca.toString();
		System.out.println(ca);
		

	}

}
