package com.createiq.aggregation;

public class Employee {
	private String name;
	private int eid;
	private double salary;
	private Address currentaddress;
	private Address perminantaddress;
	public Employee(String name, int eid, double salary,Address currentAddress, Address permanataddress, Address currentaddress) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		this.currentaddress = currentaddress;
		this.perminantaddress = permanataddress;
		
	
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", salary=" + salary + ", currentaddress=" + currentaddress
				+ ", perminantaddress=" + perminantaddress + "]";
	}
	

}
