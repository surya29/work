
public class ReverseString {

	
	public static void main(String[] args) {
		
	  String str="How are u?";
      StringBuffer s1=new StringBuffer(str);
      StringBuffer s2=new StringBuffer(s1);
      s1.reverse();
      System.out.println("original string: "+s2);
      System.out.println("reverse String: "+s1);
      
	}

}
