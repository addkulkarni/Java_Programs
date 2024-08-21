public class Perfect
{
	public static void main(String args[])
	{
		int x=0;
		for(int num=1; num<=999; num++)
		{
			for(int i=1; i<num; i++)
			{
				if(num%i==0)
				{
					x=x+i;
				}
			}
			
			if(x==num)
			{
				System.out.println(num+" is a perfect number.");
			}
			x=0;
		}	
	}
}