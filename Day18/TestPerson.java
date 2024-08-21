import java.util.Scanner;

public class TestPerson
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		
		System.out.println("Enter the serial number");
		p.srno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name");
		p.name=sc.nextLine();
		
		System.out.println("Enter the address");
		p.address=sc.nextLine();
		
		System.out.println("Enter the age");
		p.age=sc.nextInt();
		
		System.out.println("Enter the weight");
		p.weight=sc.nextInt();
		
		System.out.println("Enter the height");
		p.height=sc.nextInt();
		
		System.out.println("Enter the Mobile Number");
		p.mobno=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the Profession");
		p.profession=sc.nextLine();
		
		System.out.println("\nDetails are as follows:\n");
		System.out.println("Sr.No.: \t"+p.srno);
		System.out.println("Name: \t\t"+p.name);
		System.out.println("Address: \t"+p.address);
		System.out.println("Age: \t\t"+p.age);
		System.out.println("Weight: \t"+p.weight);
		System.out.println("Height: \t"+p.height);
		System.out.println("Mobile Number: \t"+p.mobno);
		System.out.println("Profession: \t"+p.profession);
	}
}