import java.util.Scanner;

public class TestManager
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println("Enter the salary");
		int salary=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the qualification");
		String qualification=sc.nextLine();
		
		System.out.println("Enter the branch name");
		String branchName=sc.nextLine();
		
		Manager m = new Manager(id,name,salary,qualification,branchName);	
		System.out.println("Details are as follows:\n");
		System.out.println("Id: \t\t"+m.id);
		System.out.println("Name: \t\t"+m.name);
		System.out.println("Salary: \t"+m.salary);
		System.out.println("Qualification: \t"+m.qualification);
		System.out.println("Branch Name: \t"+m.branchName);
	}
}
