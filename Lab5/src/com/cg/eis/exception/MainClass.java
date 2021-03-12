package com.cg.eis.exception;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int minsalary = 3000;
		System.out.println("Enter the salary of an employee: ");
		Scanner s = new Scanner(System.in);
		int salary = s.nextInt();
		try {
		if(salary < minsalary)
			throw new EmployeeException("Invalid salary");
		else
			System.out.println("Valid salary");
		}
		catch(EmployeeException e) {
			System.out.println(e);
		}
		

	}

}
