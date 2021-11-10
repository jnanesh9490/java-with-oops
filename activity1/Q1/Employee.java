package com.ltts;
import java.util.Scanner;
public class Employee {
	private String name,address;
	private long number;
	 public void getdata(String name,String address, long number) {
		this.name=name;
		this.address=address;
		this.number=number;
		setdata();
		
	}
	 public void setdata() {
		 System.out.println("Employee Details");
		 System.out.println("Name:"+name);
		 System.out.println("Address:"+address);
		 System.out.println("Mobile:"+number);
	 }
public static void main(String args[]) {
	Employee e=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name:");
	String s=sc.next();
	System.out.println("Enter Address:");
	String s1=sc.next();
	System.out.println("Enter Number:");
	long n=sc.nextLong();
	if(n<0) {
		System.out.println("Invalid Output!!");
	}
	else {
		
		e.getdata(s, s1, n);
	}
	
}
}
