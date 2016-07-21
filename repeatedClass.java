
public class repeatedClass {

	
	public static void main(String[] args) {
		
		int arr[]=new int[]{4,4,2,3,4,4,5};

		if(arr.length>0)
		{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=(i+1);j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
								
				break;
			}
			break;
		}
		   
	}
		else
		{
			System.out.println("not in array range");
		}

}
}
