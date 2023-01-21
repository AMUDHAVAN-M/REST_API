package Test_java;

public class Reversestring {
	public static void main(String[] args) {
		String s=" im a java developer ";
		String[] S1 = s.split(" ");
		for(int i= s.length()-1; i>=0;i--) {
			System.out.println(S1[i]+" ");
		}
	}

}
