
public class Arrays {

	public static void main(String[] args) {
		int arr[]=new int[]{1,3,5,5,7};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=(i+1);j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}

}
