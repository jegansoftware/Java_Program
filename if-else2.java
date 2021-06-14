package love;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		int lavy;
		int incentive=0;
		Scanner in=new Scanner(System.in);
		System.out.print("\nHow much was Amount Lavied? :");
		lavy=in.nextInt();
		
		if(lavy<=1000)
		{
			incentive=lavy+lavy*10/100;
		}
		else if(lavy>1000)
		{
			incentive=lavy+lavy*20/100;
		}
		
		System.out.printf("Total Amount : %d",incentive);
		

	}

}
