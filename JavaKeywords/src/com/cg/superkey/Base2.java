package com.cg.superkey;

public class Base2 extends Base1 {
		Base2()
		{
			System.out.println("Default constructor in Base2");
		}
		
		Base2(int i)
		{
			super(i);
			System.out.println("Constructor with int arg in Base2, i is"+i);
		}
		
		Base2(int i,int j)
		{
			System.out.println("Constructor with 2 int args in Base 2, i is "+i +" and j is"+j);
		}
	}

