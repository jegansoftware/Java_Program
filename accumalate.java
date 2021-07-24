package Jegan;

public class S {

		public static void main(String[] args)
		{
			int i=0;
			int sum=0;
			double sum1=0;
			
			for(i=5;i<=675;i+=5)
			{
				sum=sum+i;
			}
			
			System.out.printf("\n5+10+.........+675 =  %d ",sum); 
			
			sum=0;
			
			for(i=1;i<=17;i++)
			{
				sum=sum-i;
			}
			System.out.printf("\n-1-2-.........-17 = %d ",sum);
			
			for(i=1;i<=100;i++)
			{
				sum1=sum1+1.0/i;
			}
			
			System.out.printf("\n1/1+1/2.....+1/100 = %f",sum1);
			
			
			sum=0;sum1=0;
			
			
			for(i=1;i<=100;i++)
			{
				sum=sum+i;
				sum1=sum1+sum;
			}
			
			System.out.printf("\n1+(1+2)+.........+(1+2+.....+100) = %.2f",sum1);
			
		}
}
