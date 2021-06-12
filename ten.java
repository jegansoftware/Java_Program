package jegan;
import  java.util.Scanner;
public class ten {

	public static void main(String[] args) {
	int tamil,english,maths,social,science;
	int total;
	
	Scanner mark=new Scanner(System.in);
	
	System.out.print("\nEnter Tamil Mark:");
	
	tamil=mark.nextInt();
	
	System.out.print("\nEnter English Mark:");

	english=mark.nextInt();
	System.out.print("\nEnter Maths Mark:");
	
	maths=mark.nextInt();
	System.out.print("\nEnter Science Mark:");
	science=mark.nextInt();
	
	System.out.print("\nEnter Social Science Mark:");
	
	social=mark.nextInt();
	
	
	total=tamil+english+maths+science+social;
	
	System.out.printf("\nYour Mark Is :%d",total);
	
	}

}
