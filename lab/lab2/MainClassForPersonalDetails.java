package com.cg.lab2;
import java.util.Scanner;
public class MainClassForPersonalDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		PersonalDetailsInNewClass personalDetails=new PersonalDetailsInNewClass();
		personalDetails.setFirstName(s.nextLine());
		personalDetails.setLastName(s.nextLine());
		personalDetails.setGender(s.next().charAt(0));
		personalDetails.setAge(s.nextInt());
		personalDetails.setWeight(s.nextFloat());
		System.out.println(personalDetails);
	}
}
