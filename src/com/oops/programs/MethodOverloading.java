package com.oops.programs;



public class MethodOverloading {

	//When class have 2 or more methods with same name but different parameters it called method overloading
	//Compile time polymorphism 
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void sum(int a, int b, int c) {
		
	}
	
	public static void main(String[] args) {
		sum(5, 6);
		

	}
	
	//Method Overriding / Run time polymorphism 

}
