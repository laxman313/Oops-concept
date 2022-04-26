package com.createiq.abstraction;

public class AnimalTest {
	public static void main(String[] args) {
		Lion lion=new Lion("Lion");
		lion.eat();
		lion.sleep();
		lion.roar();
		System.out.println("====================");
		Parrot par=new Parrot("parrot");
		par.getName();
		par.eat();
		par.sleep();
		par.fly();
		System.out.println("======================");
		Penguin peg=new Penguin("penguin");
		peg.getName();
		peg.eat();
		peg.sleep();
		peg.fly();
	}

}
