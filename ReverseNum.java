
public class ReverseNum {

	
	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		int reverse=0;
		while(i!=0)
		{
			reverse=reverse*10;
			reverse=reverse+i%10;
			i/=10;
		}
			System.out.println("reverse number is: "+reverse);

	}

}
