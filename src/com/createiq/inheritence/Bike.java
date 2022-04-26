package com.createiq.inheritence;

public class Bike extends Vehicle {
	@Override
	public void engine() {
		System.out.println("bike engine");
		
		
	} public Bike() {
	System.out.println("bike wheels");
	} 
	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.engine();
		
	}
	

}
