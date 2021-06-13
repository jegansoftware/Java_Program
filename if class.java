package love;

import java.util.Scanner;

public class If {
	
	public static void main(String arg[])
	{
		double amount;
		double incentive=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter The Amount:");
		amount=in.nextDouble();
		
			if(amount>=10000)
			{
				incentive=amount*(10/100.0);
			}
			
			
			System.out.printf("Incentive  :%.2f",incentive);
	}

}
