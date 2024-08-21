import java.util.Scanner;

public class TestDeveloper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Developer d = new Developer();
		System.out.println("Enter the ID");
		d.id = sc. nextInt();
		System.out.println("Enter the name");
		d.name = sc.next();
		System.out.println("Enter the Project name");
		d.projectName = sc.next();
		System.out.println("Enter the salary");
		d.salary = sc.nextInt();
		System.out.println("Enter the grade");
		d.grade = sc.next();
		System.out.println(d.id+" "+d.name+" "+d.projectName+" "+d.salary+" "+d.grade);
	}
}