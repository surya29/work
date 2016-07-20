
public class alphabets {

	public static void main(String[] args) {
		char i;
		i=args[0].charAt(0);
		if(((i>='a')&& (i<='z'))||((i>='A') && (i<='Z')))
				{
			        System.out.println("In alphabets");
				}
		else
		{
			System.out.println("Not in alphabets");
		}
	}

}
