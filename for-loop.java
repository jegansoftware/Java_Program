package jvbnk;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		int i;
		int n;
		Scanner in=new Scanner(System.in);
		
		for(i=1;i==1;i++)
		{
			//Get Value from user
			System.out.printf("\nEnter Value:");
			n=in.nextInt();
			
			// Display Star
			for(i=1;i<=n;i++)
			{
				System.out.printf("*");
			}
		}
	}

}
