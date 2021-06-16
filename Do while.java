package jvbnk;
import java.util.*;
public class dowhile {

	public static void main(String[] args) {
		String s="";
		String a="Y";
		int age;
		Scanner in=new Scanner(System.in);
		
		do {
			
			System.out.printf("Do you mind if you enter your age ?:");
			age=in.nextInt();
			
			
			
			System.out.printf("\nDo you wish to continue?");
			s=in.nextLine();
			
		}while(s.equalsIgnoreCase(a));

	}

}
