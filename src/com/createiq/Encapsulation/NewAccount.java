package com.createiq.Encapsulation;

public class NewAccount {
	private int acno;
	private String name;
	private double balance;
	public NewAccount(String name,double balance) {
		this.name=name;
		this.balance=balance;
		}
		public NewAccount() {
		// TODO Auto-generated constructor stub
	}
		public void setAcNo(int acno) {
			 this.acno=acno;
		}
		public int getAcNo(){
			return acno;
			}
		public void setName(String name) {
			this.name=name;
		}public String getName() {
			return name;
		}public void setBalance(double balance) {
			this.balance=balance;
		}public double getBalance() {
			return balance;
		}
		
		public static void main(String[] args) {
//			NewAccount dt=new NewAccount();
//			dt.acno=11223344;
//			dt.name="harish";
//			dt.balance=50000;
//			System.out.println(dt.hashCode());
//			System.out.println(dt);
//			System.out.println(dt.getName()+" "+dt.getBalance()+" "+dt.getAcNo());
//			NewAccount dt=new NewAccount("harish",15000);
//			System.out.println(dt.getName()+"  "+dt.getBalance());
//			System.out.println();
//			
			
		}
		
	

}
