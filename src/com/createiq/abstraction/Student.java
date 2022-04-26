package com.createiq.abstraction;

public abstract class Student {
	private int mid ;
	private String mname;
	private double msalary;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int mid, String mname, double msalary) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.msalary = msalary;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getMsalary() {
		return msalary;
	}
	public void setMsalary(double msalary) {
		this.msalary = msalary;
	}
	@Override
	public String toString() {
		return "Murali [mid=" + mid + ", mname=" + mname + ", msalary=" + msalary + "]";
	}
	

}
