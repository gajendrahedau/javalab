package com.cg.lab2;

import java.util.Scanner;

public class MainClassForPersonalDetailsIncludingMobileNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		PersonalDetailsIncludingMobileNo personalDetails=new PersonalDetailsIncludingMobileNo();
		personalDetails.setFirstName(s.nextLine());
		personalDetails.setLastName(s.nextLine());
		personalDetails.setGender(s.next().charAt(0));
		personalDetails.setAge(s.nextInt());
		personalDetails.setWeight(s.nextFloat());
		personalDetails.setMobileNo(s.nextLong());
		personalDetails.printDetails();
	}

}
