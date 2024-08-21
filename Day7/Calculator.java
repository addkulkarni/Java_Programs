public class Calculator
{
	public void addition(int a, int b)
	{
		int result = a + b;
		System.out.println("Addition is " + result);
	}

	public void subtraction(int a, int b)
	{
		int result = a - b;
		System.out.println("Subtraction is " + result);
	}

	public void multiply(int a, int b)
	{
		int result = a * b;
		System.out.println("Multiplication is " + result);
	}

	public static void main(String args[])
	{
		Calculator cal = new Calculator();
		cal.addition(5,6);
		cal.subtraction(100,40);
		cal.multiply(25,12);
	}
}