package com.createiq.Encapsulation;

public class UdayAcTest {
	
	public static void main(String[] args) {
		UdayAc u = new UdayAc();
		u.setAcnum( 12345 );
		u.setName("uday");
		u.setBalance(245.66);
		System.out.println(u.getAcnum()  +u.getName() +u.getBalance());
	}

} 
