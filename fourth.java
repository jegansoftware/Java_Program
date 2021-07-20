package JavaProgramming;
import java.util.*;
public class Java {

	public static void main(String[] args) {
		int score;
		int ps=0;
		int n=0;
		Scanner sun=new Scanner(System.in);
		
		System.out.printf("\nEnter The Score:");
		while(true)
		{
		 
		 score=sun.nextInt();
		 
		 if(score>100)
		 {
			 break;
		 }
		 
		 n++;
		 if(score>70)
		 {
			 ps++;
			 System.out.printf("\n%d",score);
		 }
			 
		}
		
		System.out.printf("\nPercentage: %f",(float)ps/n*100);
				
	}

}
