package com.string;

import java.util.Scanner;

public class Convert_Character_to_String {

	public static void main(String[] args) {
	char [] name= {'a','b','c','d'};
	StringBuffer sb= new StringBuffer();
	for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
	}
	System.out.println("Convert Character to String:");
	System.out.println(	sb.append(name));
	}
}
