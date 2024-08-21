import java.util.*;

public class Factorial
{
	public static void main(String args[])
	{
		System.out.println("Enter the number to find the factorial");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact=i*fact;
		}
		System.out.println("Factorial is: "+fact);
	}
}