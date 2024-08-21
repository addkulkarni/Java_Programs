import java.util.Scanner;
public class ArraysSwitch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a[] = new int[sc.nextInt()];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		loop: while(true)
		{
			System.out.println("\n---Select choice---\n1.Even numbers\n2.Odd numbers\n3.Even index\n4.Odd index\n5.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					for(int i=0; i<a.length; i++)
					{
						if(a[i]%2==0)
						{
							System.out.print(a[i]+" ");
						}
					}
					System.out.println("\n");
					break;
				}
				case 2:
				{
					for(int i=0; i<a.length; i++)
					{
						if(a[i]%2!=0)
						{
							System.out.print(a[i]+" ");
						}
					}
					System.out.println("\n");
					break;
				}
				case 3:
				{
					for(int i=0; i<a.length; i++)
					{
						if(i%2==0)
						{
							System.out.print(a[i]+" ");
						}
					}
					System.out.println("\n");
					break;
				}
				case 4:
				{
					for(int i=0; i<a.length; i++)
					{
						if(i%2!=0)
						{
							System.out.print(a[i]+" ");
						}
					}
					System.out.println("\n");
					break;
				}
				case 5:
				break loop;
			}
		}
	}
}