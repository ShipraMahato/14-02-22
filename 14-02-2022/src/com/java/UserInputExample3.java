package com.java;

import java.util.Scanner;

public class UserInputExample3 {

	public static void main(String[] args) {
		int n1, n2, sub;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Value:");
		n1 = scanner.nextInt();

		System.out.println("Enter Second Value:");
		n2 = scanner.nextInt();
		
	sub = n1-n2;
		System.out.println("Sub= "+ sub);    
		scanner.close();
	}
}
