import java.util.Scanner;

public class Dear_If_Else {

	public static void main(String[] args) {
	
		int age;
		
		Scanner in=new Scanner(System.in);
		
		System.out.printf("Enter Your age :");
		
		age=in.nextInt();
		
			if(age>=18)
			{
				System.out.print("\nYou are Eligible");
				System.out.print("\nYou may take part");
			}
			else
			{
				System.out.print("\nSorry! You aren't eligible");
			}

	}

}
