import java.util.*;

public class ScannerClass
{
	public static void main(String args[])
	{
		ScannerClass obj = new ScannerClass();
		while(true)
		{
			System.out.println("-----Select-----\n\n1. Addition\n2. Subtraction\n3. Multiply\n4. Divide\n5. Exit\n");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice == 1)
				obj.addition();

			else if(choice == 2)
				obj.subtraction();
		
			else if(choice == 3)
				obj.multiply();
			
			else if(choice == 4)
				obj.division();			

			else if(choice == 5)
				break;
			
			else
				System.out.println("Invalid Input");
		}
	}
	
	public void addition()
	{
		System.out.println("\nEnter the two numbers to add");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = i+j;
		System.out.println("Addition of two numbers is "+k+"\n");
	} 
	
	public void subtraction()
	{
		System.out.println("\nEnter the two numbers to subtract");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = i-j;
		System.out.println("Subtraction of two numbers is "+k+"\n");
	}
	
	public void multiply()
	{
		System.out.println("\nEnter the two numbers to multiply");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = i*j;
		System.out.println("Multiplication of two numbers is "+k+"\n");
	}

	public void division()
	{
		System.out.println("\nEnter the two numbers to divide");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = i/j;
		System.out.println("Division of two numbers is "+k+"\n");
	}
}