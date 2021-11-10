package com.ltts;
import java.util.Scanner;
class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc){
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
	}
	public void displaymake() {
		System.out.println("***"+make+"***");
	}
	public void displayBasicinfo() {
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number:"+vehicleNumber);
		System.out.println("Fuel Capacity:"+ fuelCapacity);
		System.out.println("Fuel Type:"+ fuelType);
		System.out.println("CC:"+ cc);
	}
	public void displayDetailinfo() {
}
}
class TwoWheeler{
	private boolean kickStartAvailable;
	TwoWheeler(boolean kickStartAvailable){
		this.kickStartAvailable=kickStartAvailable;
	}
	public void displayDetailinfo() {
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available:"+kickStartAvailable);
	}
}
class FourWheeler{
	private String audioSystem;
	private int numberOfDoors;
	FourWheeler(String audioSystem,int numberOfDoors){
		this.audioSystem=audioSystem;
		this.numberOfDoors=numberOfDoors;
	}
	public void displayDetailinfo() {
		System.out.println("---Detail Information---");
		System.out.println("Audio System:"+audioSystem);
		System.out.println("Number of Doors:"+numberOfDoors);
	}
}
public class InheritExample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Vehicle Make:");
			String make=sc.next();
			System.out.println("Vehicle Number:");
			String number=sc.next();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			int n=sc.nextInt();
			String fuelt="";
			if(n==1)
				fuelt="Petrol";
			else
				fuelt="Diesel";
			System.out.println("Fuel Capacity:");
			int  fuel=sc.nextInt();
			System.out.println("Engine CC:");
			int  cc=sc.nextInt();
			System.out.println("Audio System:");
			String  as=sc.next();
			System.out.println("Number of Doors:");
			int  nd=sc.nextInt();
			Vehicle v=new Vehicle(make,number,fuelt,fuel,cc);
			v.displaymake();
			v.displayBasicinfo();
			FourWheeler fw=new FourWheeler(as,nd);
			fw.displayDetailinfo();
		}
		if(ch==2) {
			System.out.println("Vehicle Make:");
			String make=sc.next();
			System.out.println("Vehicle Number:");
			String number=sc.next();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			int n=sc.nextInt();
			String fuelt="";
			if(n==1)
				fuelt="Petrol";
			else
				fuelt="Diesel";
			System.out.println("Fuel Capacity:");
			int  fuel=sc.nextInt();
			System.out.println("Engine CC:");
			int  cc=sc.nextInt();
			System.out.println("Kick Start Available(Yes/No):");
			boolean  kk=sc.nextBoolean();
			Vehicle v=new Vehicle(make,number,fuelt,fuel,cc);
			v.displaymake();
			v.displayBasicinfo();
			TwoWheeler tw=new TwoWheeler(kk);
			tw.displayDetailinfo();
			
		}
		
		
	}

}
