import java.util.*;
public class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Info i = new Info();
		
		Developer d = new Developer();
		loop: while(true)
		{
			System.out.println("Select\n1.Set Data\n2.Get Data\n3.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: 
				d = i.setData();
				break;
				
				case 2:
				i.getData(d);
				break;
				
				case 3:
				break loop;
			}
		}	
	}
}