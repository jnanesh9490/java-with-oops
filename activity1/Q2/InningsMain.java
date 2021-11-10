package com.ltts;
import java.util.Scanner;
class Innings{
	private String teamname;
	private String inningsname;
	private int runs;
	public void get(String teamname,String inningsname,int runs) {
		this.teamname=teamname;
		this.inningsname=inningsname;
		this.runs=runs;
	}
	public void set() {
		System.out.println("Name:"+teamname);
		System.out.println("Scored:"+runs);
		if(inningsname.equals("Second")) {
			System.out.println("Match Ended");
		}
		else {
		System.out.println("Need "+(runs+1)+" to win");
	}
	}
}

class InningsMain {
	public static void main(String args[]) {
	Innings in=new Innings();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the team name:");
	String s1=sc.next();
	System.out.println("Enter session:");
	String s2=sc.next();
	System.out.println("Enter runs:");
	int run=sc.nextInt();
	
	in.get(s1, s2, run);
	in.set();
}
	
}
