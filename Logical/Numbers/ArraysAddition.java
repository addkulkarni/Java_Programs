import java.util.Scanner;
public class ArraysAddition
{
	public static void main(String args[])
	{
		int num1=0;
		int num2=0;
	
		System.out.println("Enter 6 elements in array");
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		for(int i=0; i<6; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0; j<5; j++)
		{
			if(a[j]+a[j+1]==9)
			{
				num1=a[j];
				num2=a[j+1];
				System.out.println(num1+"+"+num2+"=9");
			}
			
		}
	}
}