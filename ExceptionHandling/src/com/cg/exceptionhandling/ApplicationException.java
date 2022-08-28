package com.cg.exceptionhandling;

public class ApplicationException extends Exception {
	private int detail;
	ApplicationException(int a){
		detail = a;
	}
	public String toString() {
		return "ApplicationException ["+detail+"]";
	}
}
class UserException{
	static void compute(int a)throws ApplicationException{
		System.out.println("called compute("+a+")");
		if(a>10)
			throw new ApplicationException(a);
		System.out.println("Normal Exit");
	}
	public static void main(String args[]) {
		try {
			compute(1);
			compute(20);
		}
		catch(ApplicationException e) {
			System.out.println("caught"+e);
		}
	}
}

