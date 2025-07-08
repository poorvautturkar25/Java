package com.dkte;

public class Pattern {

	public static void main(String[] args) {
		
    int i, n=5;
    
    for(i=0;i<n;i++) {
    	
    	System.out.print(" ".repeat(n-i-1));
    	System.out.println(" * ".repeat(i+1));
    }
	}

}