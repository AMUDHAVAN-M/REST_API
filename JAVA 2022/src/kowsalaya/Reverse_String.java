package kowsalaya;

public class Reverse_String {

	public static String a="malayalams";
	
	public static void ReverseString() {
		
		char[] charArray = a.toCharArray();
		for (int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}	
	}

	
	public static void main(String[] args) {
	ReverseString();

	
}	
		
		
		
		
		
	}