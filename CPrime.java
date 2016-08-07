
public class CPrime {

	public void getCountOfDigitNinPrimeRange(int input1,int input2,int input3){
		
		int m[]=new int[100];
		int l=0;
		if(input1!=0){
		for(int i=input2;i<=input3;i++)
		{
			int f=0;
			for(int j=2;j<i;j++)
			{ 
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
		
	    if(f==0)
		{
	    	
			m[l]=i;
			l++;
			
		}
		}
		int k=0;
	    for(int i=0;i<m.length;i++)
	    {
	    	int d1=m[i]%10;
	    	int d2=(m[i]/10)%10;
	    
	    if(d1==input1)
	    {
	    	k++;
	    }
	    if(d2==input1)
	    {
	    	k++;
	    }
	    
	   }System.out.println(k);
	   }
	    else{
	    	System.out.println(0);
	    }
		}
	
	
	    public static void main(String[] args) {
	    	CPrime sd=new CPrime();
	    	sd.getCountOfDigitNinPrimeRange(3,11,37);
	    }
}
