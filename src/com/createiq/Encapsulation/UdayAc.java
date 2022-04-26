package com.createiq.Encapsulation;

public class UdayAc {
	private  int acnum;
	 private String name;
	private double  balance;
	@Override
	public String toString() {
		return "UdayAc [acnum=" + acnum + ", name=" + name + ", balance=" + balance + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getAcnum() {
		return acnum;
	}
	public void setAcnum(int acnum) {
	this.acnum = acnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	}
	


