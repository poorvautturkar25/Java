package com.dkte;

public class Chair {
	// Use of Static 
	
	private int weight ,height;
	private static int price = 500; // Field Initializer
	
	public Chair(int weight , int height)
	{
		this.height = height;
		this.weight = weight;
	}
	
	public static int getPrice() {
		return price ;
	}
	public static void setPrice(int price) {
		Chair.price = price;
	}

	public void display() {
		System.out.printf("Weight : %d Height : %d Price : %d\n",this.weight,this.height,Chair.price);
		

	}

}
