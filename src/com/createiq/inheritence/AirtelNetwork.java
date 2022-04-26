package com.createiq.inheritence;

public class AirtelNetwork extends Network {
	@Override
	public void calls() {
		System.out.println("network calls 1.10pisa/minute");
		
		
	}public static void main(String[] args) {
		AirtelNetwork network=new AirtelNetwork();
		network.calls();
	}
	

}
