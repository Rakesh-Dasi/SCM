package com.first.programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		int len = s.length();
		
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse of the String :: " + rev);

	}

}
