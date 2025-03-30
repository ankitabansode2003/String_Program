package com.string;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name:");
	String name=sc.nextLine();
	
	String woed[]=name.split(" ");
	 int count=woed.length;
	 
	 System.out.println("Number of words: " + count);

	}

}
