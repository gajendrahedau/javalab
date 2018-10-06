package co.cg.labbook.lab6;

import java.util.Scanner;
public class PersonMainClass {
	public static void main(String[] args) {
		Person person= new Person();
		
		 try { 
			Scanner in= new Scanner(System.in);
			 System.out.println("Enter First Name: ");
			 String firstName=in.nextLine();
			 
			 System.out.println("Enter Last Name: ");
			 String lastName=in.nextLine();
			 person.nameCheck(firstName,lastName);
			 System.out.println("Enter Gender : ");
			 String gender=in.next();
			 person.PrintDetails(firstName, lastName, gender);
			
			 
			
		} catch (EmptyInputException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
