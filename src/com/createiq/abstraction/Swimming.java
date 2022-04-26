package com.createiq.abstraction;

import java.util.Date;

public abstract class Swimming extends Athlete implements OlympicRules {

	public Swimming(String name, String nickName, Date dateOfBirth, String team, int noOfMatches) {
		super(name, nickName, dateOfBirth, team, noOfMatches);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getBiodata() {
		// TODO Auto-generated method stub
		super.getBiodata();
	}

   public abstract void swimmingfreestyle();

	

}
