package com.dkte;

public class Demo5 {

	public static void main(String[] args) {
		
		Circle c1= new Circle(5);
		
		System.out.println("Area :" + c1.calcArea());
		System.out.println("Perimeter :" + c1.calcPeri());
		
		//double rad= 5.1;
		//c1.setRadius();
		
		final Circle c2 = new Circle(3.5);
		System.out.println("Area :" + c2.calcArea());
		System.out.println("Perimeter :" + c2.calcPeri());
		
		//c2 = null; // we cannot modify reference is final 
       final  int x = 10; // final local variable 
		
		//x = 20; // NOT OK ( final field once init cannot be modified) 
		
	}

}
