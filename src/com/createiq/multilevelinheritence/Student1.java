package com.createiq.multilevelinheritence;

public class Student1 {
	String name;
	String rollNum;
	int sub1;
	int sub2;
	int sub3;
	public void details(String n,String r,int m1,int m2,int m3) {
		 name=n;
		 rollNum=r;
	 sub1=m1;
		 sub2=m2;
		 sub3=m3;
		
		
	}
public void display() {
	System.out.println("student name: "+name);
	System.out.println("student roll number: "+rollNum);
	System.out.println("marks of telugu: "+sub1);
	System.out.println("marks of english: "+sub2);
	System.out.println("marks of hindi: "+sub3);
	
}
}
