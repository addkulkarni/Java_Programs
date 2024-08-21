import java.util.Scanner;
public class TestBank
{
	public static void main(String args[])
	{
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID");
		b1.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter the name");
		b1.setName(sc.nextLine());
		
		System.out.println("Enter the number of branches");
		b1.setNoBranch(sc.nextInt());
		
		System.out.println("Enter the mobile number");
		b1.setMobno(sc.nextLong());
		sc.nextLine();
		
		System.out.println("Enter the email");	
		b1.setEmail(sc.nextLine());
		
		System.out.println("Enter the ID");
		b2.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter the name");
		b2.setName(sc.nextLine());
		
		System.out.println("Enter the number of branches");
		b2.setNoBranch(sc.nextInt());
		
		System.out.println("Enter the mobile number");
		b2.setMobno(sc.nextLong());
		sc.nextLine();
		
		System.out.println("Enter the email");	
		b2.setEmail(sc.nextLine());
		
		
		System.out.println();
		System.out.println(b1.getId());
		System.out.println(b1.getName());
		System.out.println(b1.getNoBranch());
		System.out.println(b1.getMobno());
		System.out.println(b1.getEmail());
		
		System.out.println();
		
		System.out.println(b2.getId());
		System.out.println(b2.getName());
		System.out.println(b2.getNoBranch());
		System.out.println(b2.getMobno());
		System.out.println(b2.getEmail());
	}
}