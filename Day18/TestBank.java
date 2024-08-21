import java.util.Scanner;
public class TestBank
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		
		System.out.println("Enter the Id");
		b.id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name");
		b.name=sc.nextLine();
		
		System.out.println("Enter the number of branches");
		b.noOfBranch=sc.nextInt();
		
		System.out.println("Enter the mobile number");
		b.mobno=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the email id");
		b.email=sc.nextLine();
	
		System.out.println("\nDetails are as follows:\n");
		System.out.println("ID: \t\t\t"+b.id);
		System.out.println("Name: \t\t\t"+b.name);
		System.out.println("No. of Branches \t"+b.noOfBranch);
		System.out.println("Mobile No.: \t\t"+b.mobno);
		System.out.println("Email: \t\t\t"+b.email);
		
	}
}