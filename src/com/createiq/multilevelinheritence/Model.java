

package com.createiq.multilevelinheritence;

public class Model extends Maruthi {
	 void model() {
	System.out.println("model name: MARUTHI 800");
		
	}void speed(){
		System.out.println("max speed 80kmph");
	} public static void main(String[] args) {
		Model obj=new Model();
		obj.vehicleType();
		obj.Car();
	obj.brand();
		obj.speed();
		
	}

}
 