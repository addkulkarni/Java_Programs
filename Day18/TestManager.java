import java.util.Scanner;

public class TestManager
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		System.out.println("Enter the id");
		m.id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the name");
		m.name = sc.nextLine();

		System.out.println("Enter the salary");
		m.salary = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the qualification");
		m.qualification = sc.nextLine();

		System.out.println("Enter the branch name");
		m.branchName = sc.nextLine();
		sc.close();
		
		System.out.println(m.id +" "+ m.name +" "+ m.salary +" "+ m.qualification +" "+ m.branchName);
	}
}
/*
import java.util.Scanner;

public class ReadInputWithNextLine {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");

        String userInput = sc.nextLine();

        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}
*/