package Love;

public class polynomial {

	public static void main(String[] args) {
		
		double x=1.3;
		double s=0;
		
		for(x=1.3;x<=1.4;x=x+0.01)
		{
			s=x*x-1.596*x+0.266;
			
			s=s>0?s:-s;
			
			if(s<0.001)
			{
				break;
			}
		}
		
		System.out.printf("\n Answer Is : %f",s);
		
	}

}
