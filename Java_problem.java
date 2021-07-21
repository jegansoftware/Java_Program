package Program;
import java.util.*;
public class gfc {

	public static void main(String[] args) {
		
		int a=0,b=0;
		int tempa=0,tempb=0;
		int R=0;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter First Value :");
		a=in.nextInt();
		
		System.out.printf("\nEnter Second Value :");
		b=in.nextInt();
		
		tempa=a;
		tempb=b;
			while(true) 
			{
				R=a%b;
				if(R==0)
				{
					break;
				}
			
				a=b;
				b=R;
			}
			
		System.out.printf("%d %d %d",tempa,tempb,b);
	}

}
