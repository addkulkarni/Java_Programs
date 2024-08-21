import java.util.*;
public class B
{
	public static void main(String args[])
	{
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(9);
		l.add(3);
		l.add(8);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		
		int max = 0;
		for(int i: l)
		{
			if(max<i)
			{
				max = i;
			}
		}
		System.out.println("Max number is: "+max);
	}
}