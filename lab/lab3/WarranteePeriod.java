package com.cg.lab3;
import java.time.LocalDate;
import java.util.Scanner;
public class WarranteePeriod {
	public static void main(String[] args) {
		System.out.println("Enter the Purchase date in format dd-mm-yyyy:");
		Scanner s1=new Scanner(System.in);
		String inputDate=s1.nextLine();
		int d =Integer.parseInt( inputDate.substring(0,2) );
		int m =Integer.parseInt( inputDate.substring(3,5) );
		int y = Integer.parseInt( inputDate.substring(6,10));
		System.out.println("Enter warrantee period as number Of Months and number Of Years in format "
				+ "mm/yy");
		Scanner s2=new Scanner(System.in);
		String inputPeriod=s2.nextLine();
		int mm =Integer.parseInt( inputPeriod.substring(0,2) );
		int yy =Integer.parseInt( inputPeriod.substring(3,5) );
		int noOfMonths=((yy*12)+mm);
		LocalDate purchaseDate = LocalDate.of( y , m , d );
		LocalDate expiryDate = purchaseDate.plusMonths(noOfMonths);
		System.out.println("Expiry Date: "+expiryDate);
	}
}
