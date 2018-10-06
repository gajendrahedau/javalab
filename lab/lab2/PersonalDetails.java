package com.cg.lab2;
import java.util.Scanner;
public class PersonalDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String firstName=s.nextLine();
		String lastName=s.nextLine();
		char gender=s.next().charAt(0);
		int age=s.nextInt();
		float weight=s.nextFloat();
		System.out.println("First Name:"+" "+firstName);
		System.out.println("Last Name:"+" "+lastName);
		System.out.println("Gender:"+" "+gender);
		System.out.println("Age:"+" "+age);
		System.out.println("Weight:"+" "+weight);	
	}
}
