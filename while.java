package jvbnk;

import java.util.Scanner;

public class Love {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int ln=0;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Start Value:");
		count=in.nextInt();
		
		System.out.printf("\nEnter Last Value:");
		ln=in.nextInt();
		
		
		while(count<=ln)
		{
			System.out.printf("\n%d",count);
			count++;
		}
		
		

	}

}
