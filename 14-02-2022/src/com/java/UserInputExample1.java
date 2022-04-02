package com.java;

import java.util.Scanner;

public class UserInputExample1 {

	public static void main(String[] args) {
		int n1, n2, product;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Value=");
		n1 = scanner.nextInt();

		System.out.println("Enter Second Value=");
		n2 = scanner.nextInt();

		product = n1*n2;
		System.out.println("Product = "+ product);    
		scanner.close();


	}

}
