package com.createiq.multilevelinheritence;

public class Result extends Calculation {
	public static void main(String[] args) {
		Result m=new Result();
		m.details("bhargav", "14MT313", 89, 85, 84);
		m.display();
		m.percentage();
		
	}

}
