package com.java;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
	
		int r,perimeter;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value for radius =");
		r = scanner.nextInt();
		perimeter=2*22*r/7;
		
	System.out.println("Perimeter Of Circle = "+ perimeter);	
	
	scanner.close();
	}

}
