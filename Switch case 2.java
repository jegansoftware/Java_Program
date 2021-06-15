/**
 * 
 */
package iegan;

import java.util.Scanner;

/**
 * @author Jegan
 *
 */
public class Switch_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade;
		String name="";
		String ac="";
		Scanner in=new Scanner(System.in);
		
		System.out.printf("\nEnter your Name :");
		name=in.nextLine();
		
		System.out.printf("\n");
		
		System.out.print("\nEnter Grade :");
		grade=in.nextInt();
		

		
		switch(grade)
		{
		case 1:
		{
			
		    System.out.printf("\nDear %s",name);
			System.out.printf("\nRs.1000 Incentive Will be Given to you");
			break;
		}
		
		case 2:
		   {
			System.out.printf("\nDear %s",name);
			System.out.printf("\nRs.2000 incentive Will Be Given to you");   
			break;
		   }
		case 3:
		{
			System.out.printf("\nDear %s",name);
			System.out.printf("\nRs.3000 Incentive Will be Given to you");
			break;
		}
		case 4:
		{
			System.out.printf("\nDear %s",name);
			System.out.printf("\nRs.4000 Incentive Will be Given to you");
			break;
		}
		case 5:
		{
			System.out.printf("\nDear %s",name);
			System.out.printf("\nRs.5000 Incentive Will be Given to you");
			break;
		}
		default:
		{
			System.out.printf("\nDear %s",name);
			System.out.printf("\nInvaild Value was Entered By you");
			System.out.printf("\nGrade 1,2,3,4 and 5 should be entered");
		}
	
		
		}
		
	}

}
