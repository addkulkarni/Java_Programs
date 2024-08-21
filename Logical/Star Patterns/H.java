public class H
{
	public static void main(String args[])
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=10; k>=i; k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=2; i<=10; i++)
		{
			for(int j=10; j>=i; j--)
			{
				System.out.print(" ");
			} 
			for(int k=1; k<=i; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}