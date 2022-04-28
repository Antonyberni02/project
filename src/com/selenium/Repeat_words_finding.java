package com.selenium;

import java.util.Scanner;

public class Repeat_words_finding {
 public static void main(String[] args) {
	

	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String name = s.nextLine();
	 System.out.println("Entered string is: "+name);
	 
	 int count=0;
	 char c='y';
	 for (int i = 0; i < name.length(); i++) {
		 if(name.charAt(i)==c)
		 {
			 count++;
		 }
		
	}
		System.out.println("In this entered string there are "+count+" repeated "+c+" is appearing");
		
	
}
}