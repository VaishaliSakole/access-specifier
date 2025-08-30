package com.tka.july15;

public class ipl_client {

	public static void main(String[] args) {
		access a=new access();
		System.out.println("public method");
		a.add(23,23);
		System.out.println("defalt method");
//	
		a.multi(3,3);
		System.out.println("protected method");
		a.div(4,2);
	}
}