package com.vinay;

import java.util.Scanner;

class Customer{
	String name ;
	String address ;
	String mobile ;
	
	Scanner sc = new Scanner(System.in);
	public void setDetails()
	{
		System.out.println("Enter the details:");
		String tmp = sc.nextLine();
		String[] str = tmp.split(",");
		name=str[0];
		address=str[1];
		mobile=str[2];
	}
	public void display()
	{
		System.out.print("Name:");System.out.println(name);
		System.out.print("Address:");System.out.println(address);
		System.out.print("Mobile:");System.out.println(mobile);
	}
}
public class Activity1_Qust3 {
	public static void main(String[] args) {
		Customer c= new Customer();
		c.setDetails();
		c.display();
	}

}
