package com.createiq.multilevelinheritence;

public class Calculation extends Student1 {
	public Calculation() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void display() {
	
		super.display();
	}
	
public void percentage() {
	int total=(sub1+sub2+sub3);
	double per=(total*100)/300;
	System.out.println("percentage of marks: "+per+"%");
 
	
}
}
