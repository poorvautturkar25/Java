package com.dkte;

public class Program {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.Display();
		
		Date d2 = new Date(18,4,2025);
		d2.Display();
		
		Emp e1 = new Emp(1,"Poorva",10000.00,d2);
		e1.display();
		
		Emp e2 = new Emp ();
		e2.accept();
		e2.display();
		

	}

}

