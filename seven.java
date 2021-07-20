package JavaProgramming;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		int i;
		int sum=1;
		
		
		for(i=1;i<=10;i++)
		{
			
			System.out.printf("\n%d) %d",i,sum);
			if(sum==1000000)
			{
				break;
			}
			sum=sum*10;
			
			
		}
		love();

	}
	
	static void love()
	{
		Scanner ins=new Scanner(System.in);
		int i,ps=0,score;
		double win;
		System.out.printf("\n\nEnter Six Marks :");
		for(i=1;i<=6;i++)
		{
			score=ins.nextInt();
			
			if(score>70)
			{
				ps++;
				System.out.printf(" %d ",score);
			}
		}
		
		win=(ps/6.0)*100;
		
		System.out.printf("\nPercentage : %.2f",win);
		if(win>70)
		{
			System.out.printf("\nYou passed the exam");
		}
		else
		{
			System.out.printf("\nYou Failed the exam");
		}
		
	}

}
