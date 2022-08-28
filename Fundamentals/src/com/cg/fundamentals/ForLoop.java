package com.cg.fundamentals;

public class ForLoop {

	public static void main(String[] args) {

		int length =3;
		int key =1;

		int k =0;
		out:{
		for(int i=0; i<length;i++) { //outerfor
		in:{
		for(int j=0;j<length;j++) { //innerfor
		if(i==key) {
		break in;
		}
		k=k+1; //3
		}
		}
		}
		}
		System.out.println(k);
	}

}
