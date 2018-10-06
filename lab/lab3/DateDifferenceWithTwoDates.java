package com.cg.lab3;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class DateDifferenceWithTwoDates {
	public static void main(String[] args) {
		System.out.println("Enter the first date in format dd-mm-yyyy:");
		Scanner s1=new Scanner(System.in);
		String input1=s1.nextLine();
		System.out.println("Enter the second reference date in format dd-mm-yyyy:");
		Scanner s2=new Scanner(System.in);
		String input2=s2.nextLine();
		int d1=Integer.parseInt( input1.substring(0,2) );
		int m1=Integer.parseInt( input1.substring(3,5) );
		int y1= Integer.parseInt( input1.substring(6,10));
		int d2=Integer.parseInt( input2.substring(0,2) );
		int m2=Integer.parseInt( input2.substring(3,5) );
		int y2= Integer.parseInt( input2.substring(6,10));

		LocalDate date1 = LocalDate.of( y1, m1 , d1 );
		LocalDate date2 = LocalDate.of( y2, m2 , d2 );
        Period diff = Period.between(date1, date2);
        System.out.printf("\nDifference is of %d years, %d months and %d days\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
	}
}
