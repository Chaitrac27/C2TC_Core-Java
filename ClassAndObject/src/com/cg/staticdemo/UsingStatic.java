package com.cg.staticdemo;

public class UsingStatic {

	public UsingStatic()
	{
		System.out.println("Constructor invoked");
	}

	int var_instance;
	static int var_static;
	
	public void methodX()
	{
		var_instance=4;
		var_static=5;
	}
	
	public static void main(String[] args) {
		var_static=5;
		UsingStatic obj1 = new UsingStatic();
		obj1.var_instance=4;
		System.out.println("Static :"+var_static +"\n Non Static"+obj1.var_instance);
		
		obj1.var_instance++;
		obj1.var_static++;
		System.out.println("After incrementing with obj1 Object\n Static:"+var_static+"\n Non Static:" +obj1.var_instance);
}
}