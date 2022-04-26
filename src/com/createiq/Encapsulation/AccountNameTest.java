package com.createiq.Encapsulation;

public class AccountNameTest {
	public static void main(String[] args) {
		AccountName N=new AccountName();
		System.out.println("bank name: " +N.getBranch());
		N.setAcc_no(34059837l);
		N.SetName("Apparao");
		N.setGmail("apparao123@gmail.com");
		N.SetAmount(250000f);
		System.out.println(N.getAcc_no()+"  "+N.getName()+"  "+N.getGmail()+"  "+N.getAmount());
		N.setAcc_no(12233123253312L);
		System.out.println(N.getAcc_no());
	}

}
 