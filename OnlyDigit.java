package com.string;

import java.util.Scanner;

public class OnlyDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.next();
		int sum=0;
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch>'0' && ch<='9') {
				System.out.println("Only Character print:"+ch);
				count++;
				sum=sum+count;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
