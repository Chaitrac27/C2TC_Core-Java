package com.cg.classandobject;

public class BoxDemo {

	public static void main(String[] args) {
		
		Box box1;
		box1 = new Box();
		System.out.println(box1.calcVolume());
		
		Box box2 = new Box(10,20,30);
		System.out.println(box2.calcVolume());
		
		Box box3 = new Box();
		box3.setDblDepth(1);
		box3.setDblHeight(2);
		box3.setDblWidth(3);
		
		System.out.println(box3.calcVolume());


	}

}
