package com.createiq.abstraction1;


public class StudentTest extends Person {
	
	public StudentTest(int id, String name, double salary) {
		super(id, name, salary);
		
		
		 
	}

	public static void main(String[] args) {
		
		StudentTest s = new StudentTest(10, "p. ravi", 150000);
		

		
		System.out.println(s);
		
		
		
		
		
	}

}
