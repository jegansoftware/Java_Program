package Program;

public class series {

	public static void main(String[] args) {
		int i;
		int j;
		int n;
		int k=1;
		for(i=36,j=1;i>=0;j++)
		{
		
			if(j==k)
			{
				System.out.printf(" %d ", i);
				i-=2;
				k+=2;
			}
			else if(j%2==0)
			{

					System.out.printf(" %d ", i);
					i-=4;				
					
			}
		
		}
			
		System.out.printf("\nOutput has been Displayed Successfully");
	}

}
