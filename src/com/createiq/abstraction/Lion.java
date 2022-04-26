package com.createiq.abstraction;

public class Lion extends Animal {

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println(getName()+  " name");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+  "  eating nonveg...");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(getName()+  "  sleeping Rest....");
		
	} public void roar() {
		System.out.println(getName()+  "  lion is roring");
	}

}
