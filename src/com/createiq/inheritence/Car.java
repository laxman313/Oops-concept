package com.createiq.inheritence;

public class Car extends Vehicle{
	@Override
	public void engine() {
		System.out.println("car engine");
		
		}
      public void wheels() {
    	  System.out.println("car wheels");
      }public static void main(String[] args) {
		Car car=new Car();
		car.engine();
		car.breaks();
		car.wheels();
	}
}
