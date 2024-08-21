public class Test2
{
	public static void main(String args[])
	{
		int i = 7;
		Calculator cal = new Calculator();
		if(i == 1)
		{
			cal.add();
		}
		
		else if(i == 2)
		{
			cal.sub();
		}

		else if(i == 3)
		{
			cal.mult();
		}

		else if(i == 4)
		{
			cal.div();
		}
		
		else
		{
			System.out.println("Invalid choice");
		}
	}
}