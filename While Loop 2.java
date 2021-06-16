package jvbnk;
import java.util.Scanner;
public class While_loop2 {

	public static void main(String[] args) {
		
		int n=1;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("Enter Value:");
		n=in.nextInt();
		
		while(n<=100)
		{
			
			System.out.printf("\n %d",n);
			n+=2;
			
		}

	}

}
