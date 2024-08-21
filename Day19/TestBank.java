import java.util.Scanner;
public class TestBank
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		
		System.out.println("Enter the number of branches");
		int noOfBranch=sc.nextInt();
		
		System.out.println("Enter the mobile number");
		long mobno=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the email id");
		String email=sc.nextLine();
	
		Bank b = new Bank(id, name, noOfBranch , mobno, email);
		System.out.println("\nDetails are as follows:\n");
		System.out.println("ID: \t\t\t"+b.id);
		System.out.println("Name: \t\t\t"+b.name);
		System.out.println("No. of Branches \t"+b.noOfBranch);
		System.out.println("Mobile No.: \t\t"+b.mobno);
		System.out.println("Email: \t\t\t"+b.email);
		
	}
}