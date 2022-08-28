package com.cg.finalkey;

public class Executor {

	public static void main(String[] args) {
		Derived d = new Derived();
		
		d.methodX();
		d.methodY();
		
		System.out.println("----------------------------------------------");
		
		Derived b = new Derived();
		b.methodX();
		b.methodY();
		
		System.out.println("------------------------------------------------");
		
		Derived d1 = (Derived) b;
		d1.methodX();
		d1.methodY();
		
		System.out.println("------------------------------------------------");
		
		Base b1 = (Base)d;
		b1.methodX();
		b1.methodY();
		
		System.out.println("------------------------------------------------");
	}
}
