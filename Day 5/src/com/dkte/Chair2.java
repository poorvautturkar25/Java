package com.dkte;

public class Chair2 {

	
		private int weight ,height;
		private static int price ; // Field Initializer
		
		public Chair2(int weight , int height)
		{
			this.height = height;
			this.weight = weight;
		}
		
		static { // Static Block
			price = 500;
			System.out.println("Block -- 1");
		}
		
		static {// Static Block 
			price = 1000;
			System.out.println("Block -- 2");
		}
		
		public static int getPrice() {
			return price ;
		}
		public static void setPrice(int price) {
			Chair2.price = price;
		}

		public void display() {
			System.out.printf("Weight : %d Height : %d Price : %d\n",this.weight,this.height,Chair2.price);
			
		}

}
