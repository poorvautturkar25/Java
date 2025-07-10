package com.dkte;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this (25,8,2005);
	}
	
	public Date(int day , int month , int year) {
		this.day =day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay() {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth() {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear() {
		this.year = year;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Day :");
		day = sc.nextInt();
		System.out.print("Month :");
		month = sc.nextInt();
		System.out.print("Year :");
		year = sc.nextInt();
	}
	
	public void Display() {
		System.out.printf("Date : %d/%d/%d\n",this.day,this.month,this.year);
	}


}
