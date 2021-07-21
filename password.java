package jegan;
import java.util.*;
public class User_Name {
private	String user;
private Scanner in=new Scanner(System.in);
	public void get()
	{
		int user1;
		int i;
		char c;
		int pass=0;
		int small=0;
		int under=0;
		int number=0;
		System.out.printf("\nEnter Password :");
		user=in.nextLine();
		
		user1=user.length();
		
		if(user1>=8 && user1<=11)
		{
			pass=1;
		}
		
		for(i=0;i<user1;i++)
		{
			c=user.charAt(i);
			
			if(c>='a' &&  c<='z')
			{
				small++;
			}
			if(c>='A' && c<='Z')
			{
				small++;
			}
			if((c=='_') || (c=='@'))
			{
				under=1;
			}
			
		}
		
		if((pass==1) && (small>=8)&& (under==1))
		{
			System.out.printf("\nYour Password was agreed ......");
		}
		else
		{
			System.out.printf("\n Your Pasword Wasn't agreed.....:");
		}
		
	}

}
