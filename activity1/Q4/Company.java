package com.vinay;

import java.util.Scanner;

class Company{
	String name;
	String employees;
	String teamlead;
	
	Scanner sc = new Scanner(System.in);
	void getDetails()
	{
		System.out.println("Enter the company name:");
		name = sc.nextLine();
		System.out.println("Enter the employees:");
		employees = sc.nextLine();
		System.out.println("Enter the teamlead:");
		teamlead = sc.nextLine();
	}
	
	public void Display() {
		boolean flag = false;
		String[] str = employees.split(",");
		for(String s: str)
		{
			if(s.equals(teamlead))
				flag=true;
		}
		if(flag==false)
		{
			System.out.println("Invalid input");
		}
		if(flag==true){
			System.out.print("Name:");System.out.println(name);
			System.out.print("Employees:");System.out.println(employees);
			System.out.print("Lead:");System.out.println(teamlead);
		}
	}
}
public class Activity1_Quest4 {
	public static void main(String[] args) {
		Company c = new Company();
		c.getDetails();
		c.Display();
	}
}
