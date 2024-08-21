import java.util.Scanner;

public class F
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows");
		int row = sc.nextInt();
		int count = 1;
		for(int i=1; i<=row; i++)
		{
			for(int j=1;j<=row; j++)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println("");
		}
	}
}