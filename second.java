package JavaProgramming;
import java.util.*;
public class forloop {

	public static void main(String[] args) {
		int i;
		int j=1;
		int c;
		Scanner in =new Scanner(System.in);
		
		n_1();
		for(i=0;i<=100;i+=5)
		{
			System.out.printf("\n %d", i);
		}
		
		for(j=1;j<=100;j++)
		{
			c=j%2==0?-j:j;
			
			System.out.printf("\n%4d", c);
		}
		
		n_1();
		
		//System.out.printf("\n\nValues were displayed Successfully");
	}

	
	static void n_1()
	{
		Scanner in =new Scanner(System.in);
		int n=0;
		int i;
		System.out.printf("Enter N Value :");
		n=in.nextInt();
		for(i=n;i>=1;i--)
		{
			System.out.printf("\n%d",i);
		}
	}
}
