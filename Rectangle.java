package com.acadgild.aatika.java.session4;
 import java.util.Scanner;
public class Rectangle {
	
	public int areaOfRectangle(){
	
	Scanner sc = new Scanner(System.in);
	int length,width;
	
	System.out.println("Enter the length of Rectangle");
	length = sc.nextInt();
	
	System.out.println("Enter the width of Rectangle");
	width = sc.nextInt();
	
	int Area = length*width;
	System.out.println("The area of rectangle is : "+Area);
	System.out.println("--------------------------------------");
	return Area;
	
	

	}
}