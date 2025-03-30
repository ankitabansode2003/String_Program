package com.string;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
	
		//String name[]= {"ankita","madam"};
		
	//
			if(ispalindrome(name)) {
				System.out.println("isPalindrome"+name);
			}else {
				System.out.println("Not Palindrome"+name);
			}
		}
		
		

	//}

	private static boolean ispalindrome(String name3) {
		StringBuffer sb= new StringBuffer(name3);
		sb.reverse();
		return name3.equals(sb.toString());
	}

}
