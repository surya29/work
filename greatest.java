
public class greatest {

	public static void main(String[] args) {
		int x,y,z;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		z=Integer.parseInt(args[2]);
		if((x>y) && (x>z))
		{
			System.out.println("x is greatest");
		}
		else if((y>x) && (y>z))
		{
			System.out.println("y is greatest");
		}
		else
		{
			System.out.println("z is greatest");
		}
	}

}
