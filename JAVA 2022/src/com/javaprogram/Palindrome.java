package com.javaprogram;

public class Palindrome {

	public static void main(String[] args) {
		int a=12321;
		int temp=a;
		int sum=0;
	while (a>0) {	
		
		int rem= a%10;
		sum= (sum*10)+rem;
		a=a/10;  // condition
	}	
		if (temp == sum) { // statement checking
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
