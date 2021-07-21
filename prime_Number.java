package Program;
import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prime=1;
		int i;
		int n=17;
		int s;
		int j;
		Scanner in=new Scanner(System.in);
		System.out.printf("Enter Value :");
		n=in.nextInt();
		s=(int)Math.sqrt(n);
		System.out.printf("%d Sqrt ",s);
		
		for(i=2,j=1;i<=s;i++,j++)
		{
			if(n%i==0)
			{
				prime=0;
			}
		}
		
		if(prime==1)
		{
			System.out.printf("\nPrime Number ");
		}
		else
		{
			System.out.printf("\nNot a prime Numner ");
		}
		System.out.printf("\nCount:%d", j);
	}

}
