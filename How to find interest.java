package javalover;

import java.util.Scanner;

public class compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare variable
		double P,N,R,I;
		double result;
		
		//get value from 
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Principal Amount:");
		P=in.nextDouble();
		
		System.out.printf("\nEnter Rate of Interest:");
		R=in.nextDouble();
		
		System.out.printf("\nEnter No.of Year:");
		N=in.nextDouble();
		
		I=R/100;
		
		result=P*Math.pow(1+I,N);
		
		
		//Display The Interest
		
		System.out.printf("Interest : %f",result);
	}

}
