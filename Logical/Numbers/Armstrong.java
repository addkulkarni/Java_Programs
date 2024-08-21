public class Armstrong
{
	public static void main(String args[])
	{
		for(int i=1; i<1000; i++)
		{
			int o,t,h;
			o=i%10;
			t=(i%100)/10;
			h=i/100;
			int sum=((o*o*o)+(t*t*t)+(h*h*h));
			if(i==sum)
			{
				System.out.println("Number "+i+" is an Armstrong");
			}
			
		}	
			
		
	}
}