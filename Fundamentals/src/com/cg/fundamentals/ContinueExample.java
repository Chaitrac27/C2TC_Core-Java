package com.cg.fundamentals;

public class ContinueExample {

	public static void main(String[] args) {
		
		int limit= 10;
		int sum=0;
		for(int i =1;i <= limit;i++) {
		if(i%4==0) {
		continue;
		}
		sum=sum+i; //33+10 =43
		}
		System.out.println(sum);

	}

}
