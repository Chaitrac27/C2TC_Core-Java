package com.cg.fundamentals;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		a += 5; //a=a+5---&gt;6
		b *= 4; //b=b*4---&gt;8
		c += a * b; //c=c+(a*b)--&gt;51
		c %= 6; //--&gt;3
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
