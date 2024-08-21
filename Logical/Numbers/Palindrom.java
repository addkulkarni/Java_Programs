import java.util.Scanner;

public class Palindrom
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		String a[] = new String[size];
		System.out.println("\nEnter the array elements");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.next();
		}
		
		
		for(String s:a)
		{
			String st="";
			for(int j=s.length()-1; j>=0; j--)
			{
				st=st+s.charAt(j);
			}
			if(st.equals(s))
			{
				System.out.println(s+" is palindrome");
			}
			else
			{
				System.out.println(s+" is not palindrome");
			}
		}
	}
}