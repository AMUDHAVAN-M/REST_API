package interview;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringFunctions1 {
  public static void main(String[] args) {
    String s = "name is javaprogram i";
    String[] sp = s.split(" ");
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < sp.length; i++) {
      int l = sp[i].length();
      list.add(l);
    }
    Collections.sort(list);
    
    for(int i = 0;i<sp.length;i++) {
      if(list.get(0)==sp[i].length()) {
        System.out.println(sp[i]);
      }
    }
  }
}



