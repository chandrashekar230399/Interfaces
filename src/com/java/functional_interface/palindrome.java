package com.java.functional_interface;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter reverse number:");
		int reverseNumber=0;
		int n = sc.nextInt();
		int temp =0;
		
		while(reverseNumber!=0)
		{
			temp =temp*10;
			
			temp =temp+reverseNumber%10;
			reverseNumber = reverseNumber/10;
		}
		if(temp == reverseNumber) {
			System.out.println(n);
		}
		
	}

}
