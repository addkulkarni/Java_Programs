public class Calculator
{
	public void add()
	{
		int i = 10;
		int j = 20;
		int result = i+j;
		System.out.println("Addition of two values is = " + result);
	}

	public void sub()
	{
		int i = 20;
		int j = 10;
		int result = i-j;
		System.out.println("Subtraction of two values is = " + result);
	}

	public void mul()
	{
		float i = 20.1f;
		float j = 5f;
		float result = i*j;
		System.out.println("Multiplication of two values is = " + result);
	}

	public void div()
	{
		double i = 22;
		double j = 7;
		double result = i/j;
		System.out.println("Division of two values is = " + result);
	}

	public static void main(String args[])
	{
		Calculator c = new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}