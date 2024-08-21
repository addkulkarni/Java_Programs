import java.util.*;

public class C
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
		System.out.println(l);
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			int count = 0;
			int i=itr.next();
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count<=2)
			{
				itr.remove();
			}
		}
		System.out.println(l);
	}
}