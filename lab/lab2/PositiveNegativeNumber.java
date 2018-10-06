package com.cg.lab2;
import java.util.Scanner;
public class PositiveNegativeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		String printResult=(number<0)?"Given number is Negative number":(number>0?"Given number is Positive number":"Given number is neither positive nor negative");
		System.out.println(printResult);
	}
}
