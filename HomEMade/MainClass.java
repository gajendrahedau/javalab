package com.cg.project.beans;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		EmployeeServiceImpl empservice=new EmployeeServiceImpl();
		Scanner scanner=new Scanner(System.in);
		int id,salary;
		String name,designation;
		System.out.println("Enter Employee ID");
		id=scanner.nextInt();
		System.out.println("Enter Salary");
		salary=scanner.nextInt();
		System.out.println("Enter Name");
		name=scanner.next();
		System.out.println("Enter Designation from");
		System.out.println("(Manager,programmer,clerk,system associate)");
		designation=scanner.next();
		empservice.getEmployeeDetails(id, salary, name, designation);
	}

}
