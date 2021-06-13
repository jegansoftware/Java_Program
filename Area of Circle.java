package javalover;
import java.util.*;
public class javai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare variable
		float radius;
		float area;
		
		Scanner a=new Scanner(System.in);
		//get value from user 
		System.out.printf("Enter Radius::");
		radius=a.nextFloat();
		
		//calculate the value 
		
		area=(float)22.0/7*radius*radius;
		
		
		//Display the result
		
		System.out.printf("Radius :%f - Area : %f",radius,area);
		

	}

}
