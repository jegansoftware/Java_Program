package Program;
import java.util.*;
public class median1 {

	public static void main(String[] args) {
		int n;
		int i=0;
		int score=0;
		int get=0;
		int msd=0;
		int score1=0;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Value :");
		n=in.nextInt();
		
		if(n%2==1)
		{
			score=n/2;
			score=score+1;
		}
		else
		{
			score=n/2;
			score1=score+1;
		}
		System.out.printf("\nEnter Value : ");
		
		for(i=1;i<=n;i++)
		{
			
			get=in.nextInt();
			
			if(i==score || i==score1)
			{
				msd=msd+get;
			}
		}
		
		if(n%2==1)
		{
			System.out.printf("\nMedian  :%d", msd);
			
		}
		else
		{
		
		System.out.printf("\nMedian  :%.2f", (float)msd/2);
		}
		
	}

}
