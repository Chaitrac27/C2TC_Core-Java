package com.cg.accessmodifiers;

public class Base {

	int var_default;
	public int var_public;
	private int var_private;
	protected int var_protected;
	
	void method_default()
	{
		System.out.println("Default access Base Class");
	}
	
	public void method_public()
	{
		System.out.println("Public access Base Class");
	}
	
	private void method_private()
	{
		System.out.println("Private access Base class");
	}
	protected void method_protected()
	{
		System.out.println("Protected access Base class");
	}
}

