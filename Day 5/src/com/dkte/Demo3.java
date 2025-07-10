package com.dkte;

public class Demo3 {
	

	public static void main(String[] args) {
		Chair c1 = new Chair(30,50);
		Chair c2 = new Chair(40,70);
		
		c1.display();
		c2.display();
		
		//Chair.price  = 1000;
		
		Chair.setPrice(1000);
		
		
	   System.out.println("Updated Price : " + Chair.getPrice());
	 
	   c1.display();
	   c2.display();

	}

}
