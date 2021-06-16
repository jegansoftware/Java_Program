package jvbnk;

public class For2to200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int ic;
		
		for(i=2,ic=1;i<=200;i+=2,ic++)
		{
			System.out.printf("%4d", i);
			
			
			if(ic%8==0)
			{
				System.out.printf("\n");
			
			}
			
		}

	}

}
