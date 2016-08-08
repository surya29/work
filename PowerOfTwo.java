import java.util.Scanner;


public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if((n!=2 && n%2==0) || (n==1))
		{
			n/=2;
		}
		if(n%2==0)
		{
			System.out.println("it is power of two");
		}
		else
		{
		System.out.println("it is not power of two");
		}
		in.close();
	}
}
