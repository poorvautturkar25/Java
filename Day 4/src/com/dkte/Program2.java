package com.dkte;
import java.util.Calendar;
import java.util.Scanner;

class Date1{//Concrete Class
	//fields
	private int day;
	private int month;
	private int year;
	
	//Parameter less constructor
	public Date1() {
		System.out.println("Date1() ");
		Calendar c= Calendar.getInstance();
		day =c.get(Calendar.DATE);
		month=c.get(Calendar.MONTH)+1;
		year =c.get(Calendar.YEAR);
	}
	
	public Date1(int day,int month,int year) {
		System.out.println("public Date1(day, month, year)");
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void acceptRecord() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Day :");
		day=sc.nextInt();
		System.out.print("Month :");
		month=sc.nextInt();
		System.out.print("Year :");
		year=sc.nextInt();
	}
	
	//this=d1
	/*public void printRecord() {
		System.out.println("Day :" + this.day);
		System.out.println("Month :" + this.month);
		System.out.println("Year :" + this.year);
	}*/
	
	//this = d2
	public void printRecord() {
		System.out.println("Day :" + this.day);
		System.out.println("Month :" + this.month);
		System.out.println("Year :" + this.year);
	}
	
}
public class Program2 {

	public static void main(String[] args) {
		Date1 d1= new Date1();
		Date1 d2= new Date1(25,8,2025); //d2 parameterized constructor is called
		
		/*d1.printRecord();
		d1.acceptRecord();
		d1.printRecord();
		*/
		d2.printRecord();
		
	}

}
