import java.util.Scanner;
public class Tables
{
	public static void main(String args[])
	{
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}