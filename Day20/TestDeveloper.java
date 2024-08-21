import java.util.Scanner;

public class TestDeveloper
{
	public static void main(String args[])
	{
		Developer d1 = new Developer();
		Developer d2 = new Developer();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID");
		d1.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter the name");
		d1.setName(sc.nextLine());
		
		System.out.println("Enter the project name");
		d1.setProjectName(sc.nextLine());
		
		System.out.println("Enter the salary");
		d1.setSalary(sc.nextFloat());
		sc.nextLine();
		
		System.out.println("Enter the grade");
		d1.setGrade(sc.nextLine());
		
		System.out.println("Enter the ID");
		d1.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter the name");
		d1.setName(sc.nextLine());
		
		System.out.println("Enter the project name");
		d1.setProjectName(sc.nextLine());
		
		System.out.println("Enter the salary");
		d1.setSalary(sc.nextFloat());
		sc.nextLine();
		
		System.out.println("Enter the grade");
		d1.setGrade(sc.nextLine());
		
		System.out.println(d1.getId());
		System.out.println(d1.getName());
		System.out.println(d1.getProjectName());
		System.out.println(d1.getSalary());
		System.out.println(d1.getGrade());
		
		System.out.println();
		
		System.out.println(d2.getId());
		System.out.println(d2.getName());
		System.out.println(d2.getProjectName());
		System.out.println(d2.getSalary());
		System.out.println(d2.getGrade());
	}
}