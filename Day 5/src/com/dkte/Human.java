package com.dkte;

public class Human {
	
	private int age ,weight,height;
	
	public Human(int age ,int weight, int height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}

	public void display()  {
		System.out.printf(" \nAge : %d\n  Weight : %d\n  Height : %d\n", age,weight,height);
	}

}
