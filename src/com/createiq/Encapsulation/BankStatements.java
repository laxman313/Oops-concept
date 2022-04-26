package com.createiq.Encapsulation;

public class BankStatements {
	private int acNo;
	private String name;
	private double balance;
	
	public BankStatements(int acNo,String name,double balance) {
		this.acNo=acNo;
		this.name=name;
		this.balance=balance;
		
	} 
	//deposit a
	public void deposit(double amount) {
		System.out.println("The balance :"+balance);
		this.balance=balance+amount;
		if(amount<=0) {
			System.out.println("invalid amount");
		}
		System.out.println("you have deposited amount:"+amount);
		System.out.println(balance);
	} 
	//withdraw
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("enter valid amount");
		}if(balance<=0) {
			System.out.println("insufficient funds");
		} 
		balance=balance-amount;
		System.out.println("Total balance: "+balance);
		System.out.println(balance);
	}
	public void balanceEnquiry() {
		this.balance=balance;
		System.out.println(balance); 
	}

}
