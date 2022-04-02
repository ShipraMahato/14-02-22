package com.java;

import java.util.Scanner;

public class ArofRectangle {

	public static void main(String[] args) 
	{
		int l,b, area ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value for length = ");
		l = scanner.nextInt();
		
		System.out.println("Enter the value for Breadth =");
		b = scanner.nextInt();
		
		area=  l*b ;
		
		System.out.println("Area of Rectangle = "+ area);
		scanner.close();
	}

}
