
public class Conversion {
	
		public static void main(String args[])
		{ 
			
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			String binary = Integer.toBinaryString(i); 
			String binary1 = Integer.toBinaryString(j);
			
			System.out.print("Binary value: "+binary); 
			System.out.print("\t"+binary1);
			} 
		}
