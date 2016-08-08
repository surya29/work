
public class Sum1 {


	public static void main(String args[]){
	int a=Integer.parseInt(args[0]);
	int b=1;
	int sum=0;
	int y=b;
	
	while(a!=0)
	{
	b=a%10;
	sum=sum+(int)Math.pow(b,y);
	a=a/10;
	y=b;
	

	}
	System.out.println(sum);
	}
}
