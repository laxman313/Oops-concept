package com.createiq.abstraction;

public class TestBank {
	public static void main(String[] args) {
		Bank b;
		b=new Sbi();
		System.out.println("rate of interest "+b.getRateOfInterest()+"%");
	b=new Canara();
	System.out.println("Rate of interest "+b.getRateOfInterest()+"%");
	}

}
