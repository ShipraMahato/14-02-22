package com.java;

import java.util.Scanner;

public class UserInputExample4 {

	public static void main(String[] args) {
		int n1, n2, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Value:");
		n1 = scanner.nextInt();
		System.out.println("Enter First Value:");
		n2 = scanner.nextInt();
		result= n1/n2;
		System.out.println("result = "+ result);
		
		scanner.close();
	}

}
