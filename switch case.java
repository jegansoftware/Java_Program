package iegan;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bs;
		int grade;
		double sa;
		
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Basic Salary:");
		bs=in.nextInt();
		
		System.out.printf("\nEnter Grade :");
		grade=in.nextInt();
		
		switch(grade)
		{
		case 1:
		{
			sa=bs;
			System.out.printf("%.2f",sa);
			break;
		}
		case 2:
		{
			sa=bs+bs*10/100;
			System.out.printf("%.2f",sa);
			break;
		}
		case 3:
		{
			sa=bs+bs*12.5/100;
			System.out.printf("%.2f",sa);
		}
		default:
		{
			sa=bs+bs*15/100;
			System.out.printf("%.2f",sa);
			
		}
		
		}	
	}

}
