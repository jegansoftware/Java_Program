package JavaProgramming;

public class fan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		double f;
		
		System.out.printf("\n  No     Centigrade     Fahreheit");
	
		for(i=-35,j=1;i<=125;i++,j++)
		{
			f=5.0/9*(i-32);
			
			System.out.printf("\n%4d %10d  %15.2f",j,i,f);
		}
	}

}
