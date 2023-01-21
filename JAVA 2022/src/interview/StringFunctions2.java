package interview;

import java.util.Arrays;
import java.util.Iterator;

public class StringFunctions2 {
  public static void main(String[] args) {
    String[] s = {"java","testing","arun","karthick"};
    
    
    Arrays.sort(s);
    
    for (int i = 0; i < s.length; i++) {
      System.out.println(s[i]);
    }
  }}