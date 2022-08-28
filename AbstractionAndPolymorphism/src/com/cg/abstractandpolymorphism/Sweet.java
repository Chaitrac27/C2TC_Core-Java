package com.cg.abstractandpolymorphism;

public abstract class Sweet extends Food {
	public Sweet()
	{
		System.out.println("IS SWEET");
	}
	@Override
	public String taste() {
	return "Sweet";
	}
}
