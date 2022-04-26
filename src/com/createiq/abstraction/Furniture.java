package com.createiq.abstraction;

public abstract class Furniture {
	private String name;
	private String model;
	private int legs;
	private int century;
	public Furniture(String name, String model, int legs, int century) {
		super();
		this.name = name;
		this.model = model;
		this.legs = legs;
		this.century = century;
	}
	public String getName() {
		return name;
	}public int getLegs() {
		return legs;
	}public String getModel() {
		return model;
	}
	public void details() {
		System.out.println("Furniture name: "+name);
		System.out.println("Model name: "+model);
		System.out.println("Number of legs: "+legs);
		
	}
	public abstract String materailtype();
	

}
