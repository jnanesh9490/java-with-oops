package com.vinay;

import java.util.Scanner;

class Employee2{
	String name; 
	String address;
	String mobile;
	
	Scanner sc = new Scanner(System.in);
	public void setDetails()
	{
		System.out.println("Enter the name:");
		name = sc.nextLine();
		System.out.println("Enter Address:");
		address = sc.nextLine();
		System.out.println("Enter Mobile:");
		mobile = sc.nextLine();
	}
	
	public void display()
	{
		System.out.println("Employee Details");
		System.out.print("Name:");System.out.println(name);
		System.out.print("Address:");System.out.println(address);
		System.out.print("Mobile:");System.out.println(mobile);
	}
	public void update(int input)
	{
		if(input==1)
		{
			System.out.println("The current Name is:" +name);
			System.out.println("Enter the new Name:");
			name=sc.nextLine();
		}
		if(input==2)
		{
			System.out.println("The current Address is:" +address);
			System.out.println("Enter the new Address:");
			address=sc.nextLine();
		}
		if(input==3)
		{
			System.out.println("Current mobile:" +mobile);
			System.out.println("Enter new mobile:");
			name=sc.nextLine();
		}
		
	}
}

class Menu{
	public void menu() {
		
	System.out.println("Verify and Update the Details:");
	System.out.println("Menu");
	System.out.println(" 1. Update Employee name");
	System.out.println(" 2. Update Employee Address");
	System.out.println(" 3. Update Employee mobile");
	System.out.println(" 4. All Information Correct/Exit");
}
}
public class Activity1_Qust5 {
	public static void main(String[] args) {
		Employee2  e = new Employee2();
		e.setDetails();
		e.display();
		
		Menu m1=new Menu();
		m1.menu();
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while(input!=4) {
			e.update(input);
			m1.menu();input=sc.nextInt();
		}
		if(input==4) {
			System.out.println("The detals are:");
			e.display();
			return;
		}
		
		
		
		
		
	}

}
