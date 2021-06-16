package jvbnk;

import java.util.Scanner;

public class Forlook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int nu=10;
		int i;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Value:");
		n=in.nextInt();
		
		for(i=1;i<=n;i++)
		{
			
			
			
			System.out.printf("%4d",i);
			
			if(i%10==0)
			{
				System.out.printf("\n");
			}
			
		}
		
	}

}
