package com.createiq.interface1;

public class V6 implements ExampleInterface {

	@Override
	public void run() {
		System.out.println("print run");
		
	}public static void main(String[] args) {
		V6 obj=new V6();
		obj.run();
	}
	

}
