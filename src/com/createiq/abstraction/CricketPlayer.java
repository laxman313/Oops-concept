package com.createiq.abstraction;

import java.util.Date;

public class CricketPlayer extends Athlete {
	private int noOfCenturies;
	private int noOfhalfCenturies;
	private int points;
	private float bowlingAvg;
	
	public CricketPlayer(String name, String nickName, Date dateOfBirth, String team, int noOfMatches,
			int noOfCenturies, int noOfhalfCenturies, int points, float bowlingAvg)
	{
		super(name, nickName, dateOfBirth, team, noOfMatches);
		this.noOfCenturies = noOfCenturies;
		this.noOfhalfCenturies = noOfhalfCenturies;
		this.points = points;
		this.bowlingAvg = bowlingAvg;
	}
	public void getBiodata() {
		super.getBiodata();
				System.out.println("No of centuries: "+noOfCenturies);
	}

	public void compititions() {
		super.compititions();
		
		System.out.println("number of points: "+points);
	}	
	public String bodytype() {
		
		return "body type is athletic  and  fully muscler body " ;
				
//	}public static void main(String[] args) {
//		CricketPlayer cr= new  CricketPlayer("apparqo","appu",new Date(1995,12,22), "india", 12, 10, 22, 45, 12.3f);
//		cr.getBiodata();
////		cr.compititions();
////		cr.bodytype();
		
	}
	 
	}
	
	


