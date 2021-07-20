package JavaProgramming;
import java.util.*;
public class Java1 {

	public static void main(String[] args) {
		int i;
		double r;
		double c;

		System.out.printf("\nRadius       Area          Circumference");
		System.out.printf("\n========================================");
		for(i=2;i<=47;i+=5)
		{
			r=22.0/7*i*i;
			c=2*22.0/7*i;
			
			System.out.printf("\n%3d %14.2f %16.2f",i,r,c);
			
			
		}
	}

}
