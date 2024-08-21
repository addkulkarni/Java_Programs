public class Calculator
{
	public void add(int i, int j)
	{
		int result = i+j;
		System.out.println("Addition of two numbers is       "+result);
	}

	public void sub(int i, int j)
	{
		add(10,20);
		int result = i-j;
		System.out.println("Subtraction of two numbers is    "+result);
	}

	public void mul(float i, float j)
	{
		sub(50,30);
		float result = i*j;
		System.out.println("Multiplication of two numbers is "+result);
	}
	
	public void div(double i, double j)
	{
		mul(10.4f,23.720f);
		double result = i/j;
		System.out.println("Division of two numbers is       "+result);
	}

	public static void main(String args[])
	{
		Calculator c = new Calculator();
		c.div(22.0d,7.0d);
	}
}