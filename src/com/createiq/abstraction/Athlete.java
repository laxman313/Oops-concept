package com.createiq.abstraction;

import java.util.Date;

public abstract class Athlete {
	private String name;
	private String nickName;
	private Date dateOfBirth;
	private String team;
	private int noOfMatches;

	
	public Athlete(String name, String nickName, Date dateOfBirth, String team, int noOfMatches) {
		this.name = name;
		this.nickName = nickName;
		this.dateOfBirth = dateOfBirth;
		this.team = team;
		this.noOfMatches = noOfMatches;	}
	public String getName() {
		return this.name;
	}
	public String getNikName() {
		return this.nickName;
	}public String getTeam() {
		return this.team;
	}public void getBiodata() {
		System.out.println("Name of the player: "+name);
		System.out.println("Nickname of the player: "+nickName);
		System.out.println("Tema name: "+team);
		}public void compititions() {
			System.out.println("No of world matches played: "+noOfMatches);
		} public abstract String bodytype();

}
