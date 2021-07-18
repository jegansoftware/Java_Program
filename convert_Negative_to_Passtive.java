package Love;
import java.util.*;
public class program {

	public static void main(String[] args) {
		int a;
		int temp;
		Scanner in=new Scanner(System.in);
		System.out.printf("\nEnter A Value :");
		a=in.nextInt();
		temp=a;
		if(a<0)
		{
			System.out.printf("\nNagativa Value has been entered");
			a=-a;	
			System.out.printf("\nNegative Value Has been Converted into Passitive Value Successfully\n\n");
			
		}
		else if(a>=0)
		{
			a=temp;
		}
		System.out.printf("%d",a);

	}

}
