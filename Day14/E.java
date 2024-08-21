import java.util.Scanner;

public class E
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows");
		int row = sc.nextInt();
		for(int i=row; i>=1; i--)
		{
			for(int j=row; j>=1; j--)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}