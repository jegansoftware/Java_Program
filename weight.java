package Jegan;

public class Jegan1 {

	public static void main(String[] args) {
		int moon;
		int jubiter;
		int venus;
		int mars;
		int i=0;
		System.out.printf("\n===============================================");
		System.out.printf("\nWeight      Moon     Jubiter     Venus     Mars");
		System.out.printf("\n===============================================");
		for(i=50;i<=250;i+=50)
		{		
		moon=i*16/100;
		jubiter=i*264/100;
		venus=i*85/100;
		mars=i*38/100;
		
		System.out.printf("\n%3d  %9d   %8d  %10d  %6d",i,moon,jubiter,venus,mars);
		}


	}

}
