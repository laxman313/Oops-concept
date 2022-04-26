package com.createiq.interface1;

public class InterheritsTest implements InheritsP,InheritsS{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
		
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
		
	}public static void main(String[] args) {
		InterheritsTest b=new InterheritsTest();
		b.print();
		b.Show();
	}
	

}
