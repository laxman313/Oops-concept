package com.createiq.Encapsulation;

import java.util.Scanner;

public class BankStatementsTest {
	public static void main(String[] args) {
		BankStatements ac=new BankStatements(112233,"uday",10000);
		Scanner scanner=new Scanner(System.in);
		String option="";
		do {
			System.out.println("choose option");
			System.out.println("1 deposit");
			System.out.println("2 with draw");
			System.out.println("3 balance enquiry");
			System.out.println("Enter here");
			option=scanner.next();
			switch(option) {
			case"1":{
				System.out.println("Enter deposite amount");
				String s=scanner.next();
				double amount=Double.parseDouble(s);
				ac.deposit(amount);
				ac.balanceEnquiry();
				break;
				
			}case"2":{
				System.out.println("Enter withdraw amount");
				String s=scanner.next();
				double amount=Double.parseDouble(s);
				ac.withdraw(amount);
				ac.balanceEnquiry();
				break;
			} case"3":
				
				ac.balanceEnquiry();
				break;
					
			
			default:{
				System.out.println("invalid option");
				break;
				}
				
			}
		System.out.println("do you want to continue:(yes/no)");
		option=scanner.next();
	}
	
	while(option.equalsIgnoreCase("yes"));

}
}
