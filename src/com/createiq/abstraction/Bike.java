package com.createiq.abstraction;

public abstract class Bike {
	Bike(){
		System.out.println("Bike is created");
	}	
   abstract  void run();
   void gearChanged() {
	   System.out.println("gear changed");
   }
   

}