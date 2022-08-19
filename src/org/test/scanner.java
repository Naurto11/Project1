package org.test;

import java.util.Scanner;

public class scanner {

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Atm PinNo");
		
		int pinNo = s.nextInt();
		
		System.out.println("Enter your Mobile No");
		
		long Phno = s.nextLong();
		
		System.out.println("Enter your Avg");
		
		float avg = s.nextFloat();
		
		System.out.println("Enter your Salary");
		
		double salary = s.nextDouble();
		
		System.out.println("Above Employee is present or not");

		boolean isemp= s.nextBoolean();
		
		System.out.println("My Atm PinNo is :"+pinNo);
		System.out.println("My Mobile No is :"+Phno);
		System.out.println("My Avg is :"+avg);
		System.out.println("My Salary is :"+salary);
		System.out.println("The Above Empolyee is :"+isemp);
	}
}
