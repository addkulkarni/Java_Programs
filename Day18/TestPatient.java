import java.util.Scanner;

public class TestPatient
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Patient p = new Patient();
		System.out.println("Enter the ID");
		p.id=sc.nextInt();
		System.out.println("Enter the name");
		p.name=sc.next();
		System.out.println("Enter the adress");
		p.address=sc.next();
		System.out.println("Enter the mobile number");
		p.mobno=sc.nextLong();
		System.out.println("Enter the Disease");
		p.disease=sc.next();
		
		System.out.println(p.id+" "+p.name+" "+p.address+" "+p.mobno+" "+p.disease);
	}

}