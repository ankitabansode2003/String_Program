package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String name=sc.nextLine();
	String rev[]=name.split(" ");
	String revName="";
	for(int i=rev.length-1;i>=0;i--) {
		revName=revName+rev[i];
	
	if(i!=0) {
		revName=revName+" ";
	}
	}
	System.out.println(revName);
	}
}


