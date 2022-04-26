package com.createiq.aggregation;

public class EmployeeTest {
	public static void main(String[] args) {
		Address addressOne=new Address("sr nagar","hyd");
		Address addressTwo=new Address("hzb","karimanagar");
		System.out.println(addressOne);
		System.out.println(addressTwo);
		Employee emp=new Employee("harish",1155,15000,addressOne,addressTwo, null);
		System.out.println(emp);
		
		
		 
		
	}

}
