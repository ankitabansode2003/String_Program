package com.string;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		
		 String result = name.replaceAll("\\s", ""); 

		System.out.println("Without whitespace:"+result);
	}

}
