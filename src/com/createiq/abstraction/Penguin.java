package com.createiq.abstraction;

public class Penguin extends Birds{

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"  can't fly....swim only");
	}public static void main(String[] args) {
		Penguin fly=new Penguin("penguin");
		
		fly.getName();
		fly.eat();
		fly.fly();
		fly.sleep();
		
	}

}
