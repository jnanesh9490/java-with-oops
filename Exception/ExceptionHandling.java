package sample;
import java.util.*;

public class Exception {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int totalrunsscored;
		int totaloversfaced;
		float currentrunrate=0;
		
		System.out.println("Enter the total runs scored");
		totalrunsscored=sc.nextInt();
		System.out.println("Enter the total overs faced");
		totaloversfaced=sc.nextInt();
		try {
			 currentrunrate=totalrunsscored/totaloversfaced;
			
			System.out.println("currentrunrate="+currentrunrate);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne);
		}
		
	}
	

}
