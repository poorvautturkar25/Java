package com.dkte;
import java.util.Scanner;

class Employee{
	//Fields 
	private String name; 
	private int age; 
	private double salary; 
	//parameter-less ctor 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//parameterized ctor 
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	//getter / inspector 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//setter / mutator 
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
class TestEmployee{
	Employee emp = new Employee(); 
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		emp.setName(sc.nextLine());
		System.out.print("Age : ");
		emp.setAge(sc.nextInt());
		System.out.print("Salary : ");
		emp.setSalary(sc.nextDouble());
	}
	public void printRecord( ) {
		System.out.println("Name : "+emp.getName());
		System.out.println("Age : "+emp.getAge());
		System.out.println("Salary : "+emp.getSalary());
	}
}

public class Program4 {

	public static void main(String[] args) {
		TestEmployee empTest = new TestEmployee(); 
		empTest.acceptRecord();
		empTest.printRecord();
	}

}
