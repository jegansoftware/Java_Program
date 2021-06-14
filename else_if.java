package iegan;

import java.util.Scanner;

public class loe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
					int amount;
					int grade;
					int incentive;
					
					Scanner in=new Scanner(System.in);
					
					System.out.printf("\nEnter Amount :");
					amount=in.nextInt();
					
					System.out.printf("\nEnter Grade  :");
					grade=in.nextInt();
					
					if(grade<=1)
					{
						incentive=amount+amount*10/100;
						System.out.printf("%d",incentive);
					}
					else if(grade==2)
					{
						incentive=amount+amount*20/100;
						System.out.printf("%d",incentive);
					}
					else
					{
						incentive=amount+amount*50/100;
						System.out.printf("%d",incentive);
					}
					
	}

}
