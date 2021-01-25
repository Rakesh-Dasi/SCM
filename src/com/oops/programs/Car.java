package com.oops.programs;

public class Car {
	
	public static int wheels = 4;
	public String color = "White";
	String fuel = "Petrol";
	private String type = "Vehicle";
	
	protected void Seats() {
		int seat = 5;		
		System.out.println("Car Seats are : " + seat);
	}
	
	public int speedLimit() {
		return 150;
	}
	
	public String getFuel() {
		return fuel;
	}

}
