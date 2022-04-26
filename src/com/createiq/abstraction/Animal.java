package com.createiq.abstraction;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void eat();
	public abstract void sleep(); 
	


public void test() { 
	System.out.println("i am not a abstract method");
}
	
}
