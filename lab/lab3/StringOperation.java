package com.cg.lab3;

import java.util.Scanner;

public class StringOperation {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String inputString=s.nextLine();
		System.out.println("Choose the operation:\n1)addToItself/n2)replaceOddPositions/n3)removeDuplicates/n4)changeOddToUpperCase)");
		int select=s.nextInt();
		switch (select) {
		case 1:
			addToItself(inputString);
			break;
		case 2:
			replaceOddPositions(inputString);
			break;
		case 3:
			removeDuplicates(inputString);
			break;
		case 4:
			changeOddToUpperCase(inputString);
			break;

		default:
			break;
		}

	}
	private static void changeOddToUpperCase(String s) {
		int l=s.length();
		for (int i = 0; i < l; i++) {
		    char ch = s.charAt(i);
		    if (i % 2 == 0)
		        System.out.print(Character.toLowerCase(ch));
		    else
		        System.out.print(Character.toUpperCase(ch));
		}
	}
	
	private static void removeDuplicates(String s) {
		 String uniqueString = "";
		    for (char currentChar : s.toCharArray())
		        if (!uniqueString.contains("" + currentChar))
		            uniqueString += currentChar;
		    System.out.println(uniqueString);
		}
	
	public static void addToItself(String s){
		 System.out.println(s+s);
	}
	private static void replaceOddPositions(String s) {
		int l=s.length();
		for (int i = 0; i < l; i++) {
		    char ch = s.charAt(i);
		    if (i % 2 == 0)
		        System.out.print(Character.toLowerCase(ch));
		    else
		        System.out.print("#");
		}		
	}

}
