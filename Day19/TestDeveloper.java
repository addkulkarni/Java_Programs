import java.util.Scanner;

public class TestDeveloper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println("Enter the project name");
		String projectName=sc.nextLine();
		
		System.out.println("Enter the salary");
		int salary=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the grade");
		String grade=sc.nextLine();
		
		Developer d = new Developer(id,name,projectName, salary,grade);
		System.out.println("\nDetails are as follows:");
		System.out.println("Id:\t\t"+d.id);
		System.out.println("Name:\t\t"+d.name);
		System.out.println("Project Name:\t"+d.projectName);
		System.out.println("Salary:\t\t"+d.salary);
		System.out.println("Grade:\t\t"+d.grade);
		
	}
}