package com.dkte;

public class MaximumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 100;
	    int n2 = 894;
	    int n3 = 559;
	    
	    if(n1 > n2 && n1>n3)
	    {
	    	System.out.println("The maximum no. is:" + n1);
	    }
	    else if(n2 > n1 && n2 > n3)
	    {
	    	System.out.println("The Mazmimum no. is :" + n2);
	    }
	    else
	    {
	    	System.out.println("The Mazimum no is :" + n3);
	    }
	}

}
