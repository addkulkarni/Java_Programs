import java.util.Scanner;

public class TestPerson
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the serial number");
		int srno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println("Enter the address");
		String address=sc.nextLine();
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		System.out.println("Enter the weight");
		int weight=sc.nextInt();
		
		System.out.println("Enter the height");
		int height=sc.nextInt();
		
		System.out.println("Enter the Mobile Number");
		long mobno=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the Profession");
		String profession=sc.nextLine();
		
		Person p = new Person(srno,name, address,age,weight, height, mobno, profession);
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