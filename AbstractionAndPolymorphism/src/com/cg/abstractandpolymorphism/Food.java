package com.cg.abstractandpolymorphism;

public abstract class Food {

	public static final String who_am_i = "I am Eatable";
	
	public Food()
	{
		System.out.println("IS A FOOD");
	}
	
	public abstract String consume();
	public abstract String taste();
	
	protected void prepareToEat()
	{
		wash();
		System.out.println("clean your hands");
	}
	private void wash()
	{
		System.out.println("Have you washed your hands");
	}
}
