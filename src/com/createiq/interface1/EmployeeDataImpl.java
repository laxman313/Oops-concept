package com.createiq.interface1;

public class EmployeeDataImpl implements EmlpoyeData{
	

	@Override
	public void getEmpList(Employee[] employees) {
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getByEmpId(int id) {
		Employee e1=new Employee(1011,"Srikar",16000);
		Employee e2=new Employee(1022,"Santhu",17000);
		Employee e3=new Employee(1033,"Srini",18500);
		Employee[] employees= {e1,e2,e3};
		Employee result=null;
		for(Employee emp:employees) {
			if(emp.getEid()==id) {
				System.out.println(emp+" 1st ");
			}
		} System.out.println("enter valid id");
		
	}

	@Override
	public void getByEmpName(String name) {
		Employee e1=new Employee(1155,"yama",116000);
		Employee e2=new Employee(1122,"Sun",177000);
		Employee e3=new Employee(1133,"moon",188500);
		Employee[] employees= {e1,e2,e3};
		Employee result=null;
		for(Employee emp:employees) {
			if(emp.getName()==name) {
				System.out.println(emp+" 2nd");
			}
		}
	
		
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee employees) {
		// TODO Auto-generated method stub
		
	}

}
