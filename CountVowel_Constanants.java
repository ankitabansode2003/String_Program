package com.string;

import java.util.Scanner;

public class CountVowel_Constanants {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name:");
	String name=sc.next();
	int count=0;
	int consonants=0;
	for(int i=0;i<name.length();i++) {
		char ch=name.charAt(i);
		
		if(ch>='a' && ch<='z') {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}else {
				consonants++;
			}
		}
	}System.out.println("Vowel"+count);
	System.out.println("Consonants:"+consonants);

	}

}
