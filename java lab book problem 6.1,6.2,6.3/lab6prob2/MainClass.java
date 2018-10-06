package com.cg.labbook.lab6prob2;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		try {
			Person account=new Account();
			Scanner in=new Scanner(System.in);
			System.out.println("Enter persons' name");
			String name= in.nextLine();
			System.out.println("Enter the age of person");
			float age=in.nextFloat();
			account.checkAge(age);
			System.out.println("Enter balance");
			double balance=in.nextDouble();
		} 
		catch (Exception e) {
			System.out.println(e);
			
		}
	}
}
