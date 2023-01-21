package com.javaprogram;

public class Sum_Of_Digits {

	 public static void main(String[] args) {
			
		 int a = 12345;
		 int sum = 0;
		 while (a>0) {
	     int reminder =a%10;
	         sum=sum+reminder;
	         a=a/10;
		 }
	        System.out.println(sum);
		}
	
}
