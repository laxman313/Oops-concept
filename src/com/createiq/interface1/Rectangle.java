package com.createiq.interface1;

public class Rectangle implements Drawble {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw rectangle");
		
	} public static void main(String[] args) {
		Drawble obj=new Circle();
		obj.draw();
		Drawble objr =new Rectangle();
		objr.draw();
	}

}
