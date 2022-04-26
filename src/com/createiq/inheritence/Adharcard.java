package com.createiq.inheritence;

public class Adharcard {
	int id;
	String adharRegion;
	String address;
	public void applyadhar(int id,String reg,String add) {
		this.id=id;
		this.adharRegion=reg;
		this.address=add;
		System.out.println(id+" "+reg+" "+add);
	}

}
