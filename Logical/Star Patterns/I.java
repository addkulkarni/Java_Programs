public class I
{
	public static void main(String args[])
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2; i<=10; i++)
		{
			for(int j=10; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}