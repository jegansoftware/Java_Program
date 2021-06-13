package love;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String res="";
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter The String :");
		s=in.nextLine();
		
		res+=Character.toString((char)(s.charAt(0))-1);
		res+=Character.toString((char)(s.charAt(1))-1);
		res+=Character.toString((char)(s.charAt(2))-1);
		res+=Character.toString((char)(s.charAt(3))-1);
		res+=Character.toString((char)(s.charAt(4))-1);
		
		System.out.print(res);
		
	}

}

