package com.createiq.abstraction;

public class Parrot extends Birds{
	public Parrot( String name) {
		super(name);
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"  Flying....");
		
	}

	

}
