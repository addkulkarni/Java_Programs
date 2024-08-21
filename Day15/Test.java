import java.util.Scanner;

public class Test
{
	
	public static void main(String args[])
	{
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two integer values");
		cal.add(sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter two long values");
		cal.subtract(sc.nextLong(),sc.nextLong());
		
		System.out.println("Enter two double values");
		cal.multiply(sc.nextDouble(),sc.nextDouble());
		
		System.out.println("Enter two float values");
		cal.division(sc.nextFloat(),sc.nextFloat());
	}
}