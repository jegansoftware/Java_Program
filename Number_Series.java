package Program;

public class add {

	public static void main(String[] args)
	{
		int i=1;
		int n=7;
		int j=1;
		int k=1;
		while(true)
		{
			
			if(j==k)
			{
				n=n+3;
				System.out.printf(" %d ",n);
				k+=2;
			}
			else if(j%2==0)
			{
				n=n-2;
				System.out.printf(" %d ",n);
				
				
			}
				
			j++;
			i++;
	
			
			if(i==20)
			{
				break;
			}
			
		}
	}
}
