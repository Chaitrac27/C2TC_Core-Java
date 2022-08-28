package com.cg.superkey;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Creating object of Base1\n Base1 obj1=new Base1();\n "+"This will not work because it is abstract");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("Creating object of Base2 as:\n" + "Base2 obj2 =new Base2();");
		Base2 obj2=new Base2(1);
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		System.out.println("Creating object of Base2 as:\n" +"Base1 obj3=new Base2();");
		Base1 obj3=new Base2(4,2);

		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("Creating object of Base3 as:\n"+"Base1 obj4=new Base2();");
		Base1 obj4=new Base2();
	}

}

