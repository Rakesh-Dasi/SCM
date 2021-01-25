package com.first.programs;

public class Methods {
	/*
	 * Local variable
	 * Instance Variable
	 * Class/Static variable
	 */
	
	/*
	 * Access Modifiers
	 * 
	 * public 
	 * 
	 * private -- 
	 * 
	 * protected
	 * 
	 * 
	 */
	
	int b = 2; // Instance variable 
	
	public static int type; //Class variable

	public static void main(String[] args) {
		test1();
		test2();
		
		
	}
	
	public static void test1() {
		type = 1;
		System.out.println("This is method 1");
	}
	
	public static void test2() {
		int a = 1; // Local variable method
		
		System.out.println("This is method 2");
	}
	
	
	protected static int returnNumber() {
		System.out.println("This would return a number");
		int i = 10; 		
		return i;
	}
	
	

}
