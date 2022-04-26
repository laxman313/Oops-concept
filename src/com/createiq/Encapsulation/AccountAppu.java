package com.createiq.Encapsulation;

public class AccountAppu {
	private int acno;
	private String name;
	private double balance;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
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
	@Override
	public String toString() {
		return "AccountAppu [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}
	
public static void main(String[] args) {
	AccountAppu obj=new AccountAppu();
	obj.acno=11223366;
	obj.name="Bhargav";
	obj.balance=5426;
	//System.out.println(obj.hashCode());
	System.out.println(obj);
			
			
	
}
}
