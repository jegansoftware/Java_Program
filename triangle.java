package javaprogram;
import java.util.*;
public class triangle {

	public static void main(String[] args) {
		double base;
		double height;
		double area;
		
		Scanner triangle=new Scanner(System.in);
		
		//get base from user
		System.out.printf("\nEnter Triangle\'s base:");
		base=triangle.nextDouble();
		
		
		//get height from user
		System.out.printf("\nEnter Triangle\'s Height : ");
		
		height=triangle.nextDouble();
		
		area=(base*height)/2;
		
		System.out.printf("Area of Triangle : %.1f",area);
		

	}

}