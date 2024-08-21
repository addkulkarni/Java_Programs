import java.util.Scanner;

public class Calculator
{
	public void add(int i , int j)
	{
		int result = i+j;
		System.out.println("Addition is "+result);
	}
	
	public void subtract(long i , long j)
	{
		long result = i-j;
		System.out.println("Subtraction is "+result);
	}
	
	public void multiply(double i , double j)
	{
		double result = i*j;
		System.out.println("Multiplication is "+result);
	}
	
	public void division(float i , float j)
	{
		float result = i/j;
		System.out.println("Division is "+result);
	}
}