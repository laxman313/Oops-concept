package com.createiq.abstraction;

import java.util.Date;

public class Football extends Athlete {
	private int playerYards;
	private int completionYards;
	private String franchise;
	public Football(String name, String nickName, Date dateOfBirth, String team, int noOfMatches, int playerYards,
			int completionYards, String franchise) {
		super(name, nickName, dateOfBirth, team, noOfMatches);
		this.playerYards = playerYards;
		this.completionYards = completionYards;
		this.franchise = franchise;
	}
@Override
public void getBiodata() {
	// TODO Auto-generated method stub
	super.getBiodata();
	System.out.println("current team franchise:"+franchise);
	
}@Override
public void compititions() {
	// TODO Auto-generated method stub
	super.compititions();
	System.out.println("player running yards: "+playerYards);
}@Override
public String bodytype() {
	// TODO Auto-generated method stub
	return "musculer body  athletic and sprinter";
}
} 
