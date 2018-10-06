package com.cg.labbook.lab5.service;
import com.cg.labbook.lab5.beans.Employee;
public interface EmployeeServices {
	void getEmployeeDetails(int id,String name,String designation,
			  float salary);
	 void findInsuranceScheme();
	 Employee display();
}
