package com.createiq.AccessModifier;

import java.util.concurrent.ConcurrentHashMap;

public class ConstructorclassA {
	private int a=50;
	private ConstructorclassA() {
		System.out.println("hello bhargav");
	} 
	public static void main(String[] args) {
		ConstructorclassA obj=new ConstructorclassA();
	
		
		
	}

}
class simple{
	public static void main(String[] args) {
		//ConstructorclassA obj=new ConstructorclassA(); 
		// its showing compile time error
	}
}