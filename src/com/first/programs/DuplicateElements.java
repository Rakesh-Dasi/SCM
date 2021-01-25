package com.first.programs;

public class DuplicateElements {

	public static void main(String[] args) {
	
		String name[] = {"Java", "JavaScript", "Python", "Perl", "C", "Java"};
		
		for(int i =0; i<name.length; i++) {
			
			for(int j = i+1; j<name.length; j++) {
				
				if(name[i].equals(name[j])) {
					
					System.out.println("Duplicate Element is :: " + name[i]);
				}
			}
		}
		
	}

}
