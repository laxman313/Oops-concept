package com.createiq.abstraction;

public abstract class Birds extends Animal {

	public Birds(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+ "   Feeding.....");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"  Rest......");
		
	}
	public abstract void fly();
	

}
