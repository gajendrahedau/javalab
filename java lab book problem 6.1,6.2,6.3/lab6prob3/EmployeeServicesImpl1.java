package com.cg.labbook.lab6prob3;

import com.cg.labbook.lab5.beans.Employee;

public  class EmployeeServicesImpl1 implements EmployeeServices1{
	Employee employee;
	@Override
	public Employee display() {
		return employee;
	}
	@Override
	public void getEmployeeDetails(int id, String name, String designation,
			float salary) {

		employee= new Employee(id, name, designation, salary);
	}
	@Override
	public void findInsuranceScheme() {
		if(employee.getSalary()>10000 && employee.getSalary()<30000  && (employee.getDesignation().equals("SA")||employee.getDesignation().equals("Analyst")))
			employee.setInsuranceScheme("Scheme A");
		else if(employee.getSalary()>=30000 && employee.getSalary()<40000 &&(employee.getDesignation().equals("SA")||employee.getDesignation().equals("Analyst")|| employee.getDesignation().equals("Analyst")))
			employee.setInsuranceScheme("Scheme B");
		else if(employee.getSalary()>=40000  && employee.getDesignation().equals("Manager"))
			employee.setInsuranceScheme("Scheme C");
		else if(employee.getSalary()<10000 && employee.getDesignation().equals("Associate"))
			employee.setInsuranceScheme("No Scheme");
		else
			employee.setInsuranceScheme("No Scheme");
	}

	@Override
	public void checkSalary(float salary) throws EmployeeException {
		if(salary<3000)
			 throw new  EmployeeException("Please enter valid salary");
	}
}
