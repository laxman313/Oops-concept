package com.createiq.AccessModifier;

public class ClassA {
	private int data=40;
	private void a() {
		System.out.println("hello bhargav");
	} 


	public static void main(String[] args) {
		ClassA obj=new ClassA();
		System.out.println(obj.data);
		obj.a();
		
		
	}


  //class simple {
	//public static void main(String[] args) {
		ClassA obj=new ClassA();
//		System.out.println(obj.data);
//		obj.a();
	}
