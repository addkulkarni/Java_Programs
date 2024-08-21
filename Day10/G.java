public class G
{
	public static void main(String args[])
	{
		int no = 22;
		if(no%3 == 0 && no%5==0)
		{
			System.out.println("Number is divisile by both 3 and 5");
		}
		else if(no%3==0)
		{
			System.out.println("Number is divisible only by 3");
		}
		else if(no%5==0)
		{
			System.out.println("Number is divisible only by 5");
		}
		else
		{
			System.out.println("Number is divisible neither by 3 nor by 5");
		}
	}
}