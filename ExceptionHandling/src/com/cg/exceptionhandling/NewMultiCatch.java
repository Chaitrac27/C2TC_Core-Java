package com.cg.exceptionhandling;

public class NewMultiCatch {
	public static void main(String args[]) {
		try {
			int a = args.length;
			System.out.println("a="+a);
			int b = 42/a;
			int c[]= {1};
			c[42]=99;
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			System.out.println("Problem in operation.Details:"+e);
		}
		catch(Exception e) {
			System.out.println("Generic Exception:"+e);
		}
		System.out.println("After try/Catch blocks.");
	}
}

