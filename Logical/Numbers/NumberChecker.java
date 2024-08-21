import java.util.Scanner;
public class NumberChecker
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if(a>0 && a%2==0)
		{
			System.out.println("Number is even positive");
		}
		
		else if(a<0 && a%2==0)
		{
			System.out.println("Number is even negative");
		}
		
		else if(a>0 && a%2!=0)
		{
			System.out.println("Number is odd positive");
		}
		
		else if(a<0 && a%2!=0)
		{
			System.out.println("Number is odd negative");
		}
		
		else
		{
			System.out.println("Number is 0");
		}
	}
}