package com.cg.abstractandpolymorphism;

public class CarrotHalwa extends Halwa {
	public CarrotHalwa()
	{
		System.out.println("Carrot Halwa");
	}
	@Override
	public void makeHalwa() {
		System.out.println("Search receipe for CARROT HALWA and make it");
	}
	@Override
	public String consume() {
		System.out.println(who_am_i);
		prepareToEat();
		return "eat when hot or cold but not when ice frozen";
	}
}