package interview;

import java.util.Arrays;

public class StringFunctions3 {
  public static void main(String[] args) {
//    String s = "java"; // aajv
//    String s1 = "jaav"; // aajv

    String[] s = { "java", "arun", "jaav", "program" };
    for (int i = 0; i < s.length; i++) {
      for (int j = i + 1; j < s.length; j++) {
        if (s[i].length() == s[j].length()) {

          char[] c1 = s[i].toCharArray();
          char[] c2 = s[j].toCharArray();

          Arrays.sort(c1); // aajv

          Arrays.sort(c2); // aajv

          boolean equals = Arrays.equals(c1, c2);
          if (equals) {
            System.out.println(s[i]+" anagram "+s[j]);
          } 

        }
      }

    }
  }


}
