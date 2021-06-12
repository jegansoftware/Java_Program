package jegan;
import java.util.Scanner;
public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		double rate;
		int year;
		double cal;
		Scanner in=new Scanner(System.in);
		
		//Amount 
		System.out.printf("\nEnter Amount :");
		amount=in.nextDouble();
		
		//rate
		System.out.printf("\nEnter Rate of interest:");
		rate=in.nextDouble();
		
		//year
		
		System.out.printf("\nEnter Number of years");
		year=in.nextInt();
		
		
		//calculation
		
		cal=amount*rate*year/100;
		
		System.out.printf("\n Total Amount :%.2f", cal);
		
		
	}

}
