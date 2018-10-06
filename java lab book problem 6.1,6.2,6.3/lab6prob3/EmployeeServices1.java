package com.cg.labbook.lab6prob3;
import com.cg.labbook.lab5.beans.Employee;
public interface EmployeeServices1 {
	void getEmployeeDetails(int id,String name,String designation,
			  float salary);
	 void findInsuranceScheme();
	 Employee display();
	 public void checkSalary(float salary) throws EmployeeException;
}
