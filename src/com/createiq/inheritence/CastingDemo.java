package com.createiq.inheritence;

public class CastingDemo {
	public static void main(String[] args) {
		byte a=120;
		System.out.println(a);
		//implicit
		int b=a;
		System.out.println(b);
		int c=1000;
		// explicit
		byte d=(byte)c;
		System.out.println(d);
		
	}

}
