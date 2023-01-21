package interview;

public class StringFunctions {

	
		  public static void main(String[] args) {

		    String s = "java123Program&64jav";
		    //12alpspcl
		    String alpha ="";
		    String num ="";
		    String spcl ="";
		    for (int i = 0; i < s.length(); i++) {
		      char c = s.charAt(i);
		      if(Character.isLetter(c)) {
		        alpha = alpha+c;
		      }else if(Character.isDigit(c)) {
		        num = num +c;
		      }else {
		        spcl = spcl+c;
		      }
		      
		    }
		    
		    System.out.println(num+alpha+spcl);
		    
		    
		  }}

		
	
	
	
	
	
	
	
	
	
	
	//string s "java123Program&64jav";
	//12 alp sp cl
	
	//string alpha = 
	
//	String s = "my name java program";
//	
//	String[] sp = s.split(" ");
//	 
//	
//	List<Integer> list = new ArrayList<>();
//	 for (int i=0;i<sp.length;i++) {
//	 int 1= sp[i].length();
//	 list.add();
//	 
	
	
	
	
	
	
	
	
	
	
	
	