import java.util.Scanner;

public class TestPatient
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println("Enter the address");
		String address=sc.nextLine();
		
		System.out.println("Enter the mobile number");
		long mobno=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the disease");
		String disease=sc.nextLine();
		
		Patient p = new Patient(id,name,address,mobno,disease);
		System.out.println("\nDetails are as follows:");
		System.out.println("Id:\t\t"+p.id);
		System.out.println("Name:\t\t"+p.name);
		System.out.println("Address:\t"+p.address);
		System.out.println("Mobile No.:\t"+p.mobno);
		System.out.println("Disease:\t"+p.disease);
	}

}