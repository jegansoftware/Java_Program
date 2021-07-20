package JavaProgramming;
import java.util.*;
public class octal_Number {

	public static void main(String[] args) {
		int i;
		int n;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Value :");
		
		n=in.nextInt();
		
		for(i=1;i<=n;i++)
		{
			System.out.printf("\n%3d   %3o",i,i);
		}
		
		System.out.printf("\nOctal number has been displayed successfully");
		

	}

}
