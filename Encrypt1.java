import java.util.Scanner;


public class Encrypt1 {

	


	
		public static void main(String[] args) {
			int l=0, h=0,f=0;
			char res='a', r='a', z='a';
			char letter='a';
			String a="", b="",v="",o="";
			Scanner in=new Scanner(System.in);
			System.out.println("Enter a string :");
			String s=in.nextLine();
			String st[]=s.toLowerCase().split(" ");
			for(int i=0;i<st.length;i++)
			{
				for(int j=0;j<st[i].length();j++)
				{

					letter=st[i].charAt((st[i].length()-1));
					if(letter>='A' && letter<='Z')
						l  =(int)letter - 'A'+1;
					else  if(letter>='a' && letter<= 'z')
						l=(int)letter - 'a'+1;
					
					r=st[i].charAt((st[i].length()-2));
					if(r>='A' && r<='Z')
						h  =(int)r - 'A'+1;
					else  if(r>='a' && r<= 'z')
						h=(int)r - 'a'+1;

					f=h-l;

					if ( f>=1 && f<=26 )
					{    
						res = (char) ((f) + 96);
						a=new StringBuilder().append(res).append(letter).toString();
						
					}

					else if(f<=0 || f>=-25)
					{
						res = (char) ((f) + 122);
						a=new StringBuilder().append(res).append(letter).toString();
						
					}
					
					h=0;f=0;
					for(int n=st[i].length()-3;n>=0;n--)
					{
						z=st[i].charAt(n);
						if(z>='A' && z<='Z')
							h  =(int)z - 'A'+1;
						else  if(z>='a' && z<= 'z')
							h=(int)z - 'a'+1;

						f=h-l;

						if ( f>1 && f<26 )
						{    
							res = (char) ((f) + 96);
							b=new StringBuilder().append(res).append(a).toString();
							
						}
						else if(f<=0 || f>=-25)
						{
							res = (char) ((f) + 122);
							b=new StringBuilder().append(res).append(a).toString();
							
						}
						h=0;f=0;z='a';a=b;
					}
				}

				o=new StringBuilder().append(v).append(" ").append(a).toString();
				v=a;
				letter='a';
				h=0;f=0;z='a';l=0;
				r='a'; a="";b="";res='a';

			}
				boolean hasLowercase = !s.equals(s.toUpperCase());
				if(hasLowercase==true)
				{
					System.out.println("The encrypted string is : ");
					System.out.println(o);
				}
				else
				{
					System.out.println("The encrypted string is : ");
					System.out.println(o.toUpperCase());
				}
				in.close();
			}
	}
	
