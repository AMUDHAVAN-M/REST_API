package com.javaprogram;

public class Count_No_Of_Digits {

		 public static void main(String[] args) {
				
			 int a = 12345;
			 int count = 0;
			
			 while (a>0) {
		     int reminder =a%10;
		         count ++;
		         a=a/10;

	}
System.out.println("count the no of digits:" +count);
}
}