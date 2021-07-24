package Jegan;
import java.util.*;
public class postoffice {

	public static void main(String[] args) {
		double weight;
		double e1=0;
		double e2=0;
		double abc;
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter Parsal Weight :");
		weight=in.nextDouble();
		
		/*if(weight<=1)
		{
		e1=1;
		}
		
		e2=weight-1;
		
		if(e2!=(int)e2)
		{
			e2=(int)e2+1;
		}
		
		System.out.printf("\n First : %.2f Second  : %.2f", e1,e2);*/
		
		
		abc=weight+0.49;
		
		abc=Math.round(abc);
		
		e1=abc-1;
		
		e2=e1*17;
		
		System.out.printf("Answer Is : %.2f",e2+20);
	}

}
