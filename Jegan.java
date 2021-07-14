package Jegan;
import java.util.*;
public class Main {
	
	public static void main(String args[])
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.printf("Enter A value:\n");
		n=in.nextInt();
		
		switch(n)
		{
		case 1:
			
			System.out.printf("\nFresh Man");
			break;
		case 2:
			
			System.out.printf("\nSophomore");
			break;
		
		case 3:
			
			System.out.printf("\nJunior");
			break;
			
		default:
			System.out.printf("\nError");
		}
	}

}
