import java.util.*;

public class A
{
	int i;
	int j;
	public static void main(String args[])
	{
		A a = new A();
		a.i = 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a.j = sc.nextInt();
		System.out.println("\n"+a.i);
		System.out.println(a.j);
	}
}