package com.createiq.Encapsulation;

public class AccountName {
	private String branch="State bank";
	private String name,gmail;
	private long acc_no;
	private float amount;
	public String getBranch() {
		return branch;
	}
	 public long getAcc_no() {
		 return acc_no;
	 } 
	 public  void setAcc_no(long acc_no) {
		  this.acc_no=acc_no;
	 } 
	 public  String getName() {
		 return name;
	 } public  void SetName(String name) {
		 this.name=name;
	 }public String getGmail() {
		 return gmail;
	 }public void setGmail(String gmail) {
		 this.gmail=gmail;
	 }public float getAmount() {
		 return amount;
	 }public void SetAmount(float amount) {
		 this.amount=amount;
	 }
	 
	

}
