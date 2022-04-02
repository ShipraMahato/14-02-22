package com.java;

import java.util.Scanner;

public class NestedIfElse2 {

	public static void main(String[] args) {
		int n;
Scanner scanner = new Scanner(System.in);
		
System.out.println("Enter the Number");
n = scanner.nextInt();
scanner.close();
		if(n>0)
		{
			System.out.println("The number is positive."); // Checking positive number

			if(n%2==0)   
			{
				System.out.println(n+" is even number"); // Checking even number
			}
			else
			{
				System.out.println(n+" is odd number.");  // Checking odd number
			}

		}

		else  
		{  
			System.out.println("The number is negative.");  // Checking negitive number

		}  
		

	}

}
