import java.util.Scanner;

public class PrimeOrNot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("\nEnter the array elements");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<size; i++)
		{
			int count=0;
			for(int j=2; j<=a[i]; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]+" is a prime number");
			}
			else
			{
				System.out.println(a[i]+" is not a prime number");
			}
		}
	}
}