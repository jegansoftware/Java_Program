package javaprogram;
import java.util.*;
public class javaplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		double height;
		double volume;
		
		Scanner bus=new Scanner(System.in);	
		//get Area from user
		System.out.printf("\nEnter Cylinder Area   :");
		area=bus.nextDouble();
		
		//get Height from User
		
		System.out.print("\nEnter Cylinder Height  :");
		height=bus.nextDouble();
		
		volume=area*height;
		
		System.out.printf("Cylinder Volume :%.2f", volume);
		
	}

}
