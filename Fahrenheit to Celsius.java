package javalover;

import java.util.Scanner;

public class fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variable
		float f;
		float result;
		int i=1;
		Scanner in=new Scanner(System.in);
		do {
		
		System.out.printf("\nEnter Fahrenheit :");
		f=in.nextFloat();
		
		result=(float)(5/9.0)*(f-32);
		
		System.out.printf("Result :%f",result);
		}while(i<=4);
		
		++i;
		
	}

}
