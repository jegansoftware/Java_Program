package javaprogram;
import java.util.*;
public class Square {

	public static void main(String[] args) {
		double length;
		double area;
		
		Scanner out=new Scanner(System.in);
		System.out.print("\nEnter Length of Square:");
		length=out.nextDouble();
		
		area=length*length;
		
		System.out.printf("Area of Square  :%f",area);
		
	

	}

}
