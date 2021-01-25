package com.first.programs;

public class MethodParameters {
	
	
	
	public static void myMethod(String name, int age) {
		System.out.println("Welcome : " + name + " Age is :: " + age);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	static void checkAge(int age) {
		if(age < 18 ) {
			System.out.println("You are not old enough..!");
		}
		else {
			System.out.println("You are old enough.. !");
		}
	}
	
	public static void main(String[] args) {
		int c = add(8, 2);
		
		System.out.println("Addition is :: " + c);
		
		checkAge(17);
	}

}
