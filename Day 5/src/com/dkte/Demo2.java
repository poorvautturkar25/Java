package com.dkte;

public class Demo2 {

	public static void main(String[] args) {
		Human [] arr =new Human[4];
		
		arr[0] = new Human(31, 69, 172);
		arr[1] = new Human(36, 78, 167);
		arr[2] = new Human(24, 56, 189);
		arr[3] = new Human(45, 56, 167);
		
		for(int i=0; i< arr.length; i++) {
			arr[i].display();
		}
	}

}
