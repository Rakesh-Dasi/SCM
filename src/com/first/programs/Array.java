package com.first.programs;

public class Array {
	
	/*
	 * int i = 5, 4, 6, 7, 4, 3;
	 * 
	 * double d = 11.345;
	 */

	public static void main(String[] args) {
	
//		int a[] = new int[3];
//		
//		a[0]= 10;
//		a[1] = 3;
//		a[2] = 4;
		
		
		int a[] = {2, 3, 4, 7, 2, 5, 3, 6};
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("----------------------------------------------");
		
//		String s[][] = new String[3][2];
//		
//		s[0][0] = "User1";
//		s[0][1] = "Password1";
//		
//		s[1][0] = "User2";
//		s[1][1] = "Password2";
//		
//		s[2][0] = "User3";
//		s[2][1] = "Password3";
		
		
		String s[][] = {{"User1", "Password1"}, {"User2", "Password2"}};
 		
		for(int i= 0; i<s.length; i++) {  
			for(int j=0; j<s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
		
		
	}

}
