package Jegan;
import  java.util.*;
public class Mark {

	public static void main(String[] args) {
		int m1,m2,m3,total;
		double avg;
		Scanner in=new Scanner(System.in);
		System.out.printf("\nEnter Mark 1:");
		m1=in.nextInt();
		
		System.out.printf("\nEnter Mark 2:");
		m2=in.nextInt();
		System.out.printf("\nEnter Mark 3:");
		m3=in.nextInt();
		total=m1+m2+m3;
		avg=total/3.0;
		
		System.out.printf("\nMark  1: %d",m1);
		System.out.printf("\nMark  2: %d",m2);
		System.out.printf("\nMark  3: %d",m3);
		System.out.printf("\nTotal  : %d",total);
		System.out.printf("\nAverage: %.2f",avg);
		if(total>=185)
		{
			System.out.printf("\nResult : PASS");
		}
		else
		{
			System.out.printf("\nResult : FAIL");
		}
	}

}
