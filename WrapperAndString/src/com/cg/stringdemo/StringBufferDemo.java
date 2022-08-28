package com.cg.stringdemo;

public class StringBufferDemo {

public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Hello Dora");
		System.out.println("buffer ="+buffer);
		System.out.println("length ="+buffer.length());
		System.out.println("capacity ="+buffer.capacity());
		
		String s;
		int a =42;
		buffer = new StringBuffer(40);
		s = buffer.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		
		buffer = new StringBuffer("I JAVA!");
		buffer.insert(2, "like ");
		System.out.println(buffer);
	}
}
