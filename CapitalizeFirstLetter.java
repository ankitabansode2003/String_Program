package com.string;

import java.util.Scanner;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		String word[]=name.split(" ");
		String result="";
		 for(String words:word) {
			 if(!words.isEmpty())
			result=result+words.substring(0, 1).toUpperCase()+words.substring(1).toLowerCase()+" ";
		 }
		 System.out.println(result);

	}

}
