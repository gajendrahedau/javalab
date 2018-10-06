package com.cg.labbook.lab6prob3;
import java.util.Scanner;

import com.cg.labbook.lab5.beans.Employee;
import com.cg.labbook.lab5.service.EmployeeServices;
import com.cg.labbook.lab5.service.EmployeeServicesImpl;

public class MainClass {
	public static void main(String[] args)  {
		try {
			EmployeeServices1 employeeServices=new EmployeeServicesImpl1() ;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter employee id");
			int id=in.nextInt();
			System.out.println("Enter the name of employee");
			String name=in.next();
			System.out.println("Enter designation");
			String designation=in.next();
			System.out.println("Enter salary");
			float salary=in.nextFloat();
			employeeServices.getEmployeeDetails(id,  name,designation,salary);
			employeeServices.checkSalary((float)salary);
			employeeServices.findInsuranceScheme();
			System.out.println(employeeServices.display());
		} 
		catch (EmployeeException e) {
			System.out.println(e);
		}
	}	
}
