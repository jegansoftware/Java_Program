package JavaProgramming;

public class forloop2 {

	public static void main(String[] args) {
		int i,j;
		
		for(i=1;i<=21;i++)
		{
			if(i%5==1)
			{
				for(j=1;j<=6;j++)
				{
					System.out.printf("*****");
				}
				System.out.printf("\n");
			}
			else
			{
					for(j=1;j<=6;j++)
					{
						System.out.printf("*    ");
					}
					
					System.out.printf("\n");
			}
			
		}	

	}

}
