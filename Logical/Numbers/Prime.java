import java.util.*;

public class Prime
{
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Number is a Prime number");
		}
		else
		{
			System.out.println("Number is not a prime number");
		}
	}
}