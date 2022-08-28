package com.cg.singletonclass;

public class Executor {

	public static void main(String[] args) {
		
		/*
		* Following statement will not work as
		* constructor is private
		* MyClass obj=new MyClass();
		*/
		MyClass obj=MyClass.getInstance();
		MyClass.count();
		System.out.println("Creating one more reference ....");
		MyClass obj1=MyClass.getInstance();
		MyClass.count();

	}

}
