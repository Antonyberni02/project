package com.selenium;

import java.util.Scanner;

public class ReverseString {
	
	public void reverse() 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("ENTER THE STRING:");
		String line = s.nextLine();
		for(int length=line.length()-1;length>=0;length--)
		{
			System.out.print(line.charAt(length));
		}
		
		
		
	}
	public static void main(String[] args) {
		
		ReverseString rs=new ReverseString();
		rs.reverse();
	}

}
