public class NestedIf
{
	public static void main(String args[])
	{
		int age = 19;
		int weight = 100;
		if(age>20 && age<55)
		{	
			System.out.println("Age is valid");
			if(weight>50 && weight<90)
			{
				System.out.println("Weight is valid");
			}
			else
			{
				System.out.println("Weight is invalid");
			}
		}
		else
		{
			System.out.println("Age is invalid");
		}
	}
}