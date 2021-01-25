package com.first.programs;

public class ConstructorExample {
	
	int age;
	String name;
	
	//It is a method used to intialize the objects
	//It is used to set initial values for the attributes
	
	public ConstructorExample(int lage, String lname) {
		age = lage;
		name = lname;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorExample constructorExample = new ConstructorExample(25, "Rakesh");
		
		System.out.println(constructorExample.name + " age is : " + constructorExample.age);
	}
	/*
	 * Access Modifiers - Controls the access level
	 * 
	 * public - code is accessible for all the classes
	 * 
	 * private - code is accessible within the declared class
	 * 
	 * protected - code is accessible in the same package
	 * 
	 * Non Access Modifiers 
	 * 
	 * final, abstract
	 * 
	 * 
	 * 
	 */

}
