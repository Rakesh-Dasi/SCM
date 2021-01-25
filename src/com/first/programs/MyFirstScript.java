package com.first.programs;

public class MyFirstScript {

	public static void main(String[] args) {
		
		// Naming convention for Package 
		// all lowercase
		// prefix - com, edu, gov, net, org 
		
		// Data types in Java
		
		char c = 'd';
		
		String s = "Hello World";
		
		String s1 = " This is Java Tutorial";
		
		
		int a =  20;
		
		int b = 20; 
		
	    s.length();
	    
	    s.charAt(3);
	    
	    /*
	     * if(condition){
	     * }else{
	     * }
	     */
	    
	    // If Else Conditions in Java
	    
	    if(a < b) 
	    {	    	
	    	System.out.println("a is less than b");
	    }
	    else if(a==b)
	    {
	    	System.out.println("a is equal to b");
	    }
	    else 
	    {
	    	System.out.println("a is greater than b");
	    }
		
		//Loop in Java 
	    
	    /*
	     * 1. Variable Initialization
	     * 2. Condition to Terminate
	     * 3. Increment/Decrement
	     * 
	     */
	    
	    for(int i = 0; i<=4; i++) {
	    	System.out.println("Value of i is : " + i);
	    }
	    
	    System.out.println("-------------------------------------------------------");
	    
	    for(int j = 5; j>=0; j--) {
	    	System.out.println("Value of j is : "+ j);
	    }
		
	    System.out.println("-------------------------------------------------------");
	    //While Loop in Java
	    
	    int i = 0;
	    
	    while(i<5) {
	    	System.out.println("While loop " + i);
	    	i++;
	    }
	    
		
		
	}

}
