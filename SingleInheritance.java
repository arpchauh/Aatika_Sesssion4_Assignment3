package com.acadgild.aatika.java.session4;
import java.util.Scanner;
public class SingleInheritance extends Rectangle{
		
		public int areaOfTriangle(){
			int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of Triangle");
		a = sc.nextInt();
		
		System.out.println("Enter the second side  of Triangle");
		b = sc.nextInt();
		
		System.out.println("Enter the third side  of Triangle");
		c = sc.nextInt();
		
		int Area = (a+b+c)/2;
		System.out.println("The area of triangle is : "+Area);
		return Area;
		
		
	}
		
		public static void main(String[] args) {
			
			SingleInheritance ob = new SingleInheritance();
			
			ob.areaOfRectangle();
			ob.areaOfTriangle();
		}
	
}


