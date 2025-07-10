package com.dkte;

public class Circle {
	
	private double radius ;
	private final double PI = 3.14; // Field Init (final field)
	{
		// PI = 3.14; // Object Initializer / instance init
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		// PI = 3.14;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPI() {
		return PI;
	}
	
    public double calcArea() {
    	return PI * this.radius * this.radius;
    }
    
    public double calcPeri() {
    	return 2 * PI * this.radius;
    }
		

	

}
