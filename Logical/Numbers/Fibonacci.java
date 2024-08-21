public class Fibonacci
{
	public static void main(String args[])
	{
		int num=20;
		int x=0;
		int y=1;
		for(int i=1; i<=5; i++)
		{
			System.out.print(" "+x);
			System.out.print(" "+y);
			x=x+y;
			y=x+y;
			
		}
	}
}