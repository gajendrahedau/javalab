package com.cg.lab3;
import java.util.Arrays;
import java.util.Scanner;
public class PositiveString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String inputString=s.nextLine();
		char [] array=inputString.toCharArray();
		char[]temp=Arrays.copyOf(array, array.length);
		int count=0;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
			if(array[i]!=temp[i]){
				System.out.println("String is not positive");
				count++;
				break;				
			}
		if (count==0)
			System.out.println("String is positive");
	}
}
