package com.oops.programs;

public class Audi extends Car {

	//Car is Parent Class 
	
	public int speed = 250;
	
	public int speedLimit() {
		return 250;
	}
	
	public static void main(String[] args) {
		
		Car obj = new Audi();
		//Audi audi = new Audi();
		
		int speed = obj.speedLimit();
		
		System.out.println("Speed Limit : " + speed);

	}

}
