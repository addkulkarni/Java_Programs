import java.util.*;

public class A
{
	public static void main(String args[])
	{
		List<Integer> l = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		
		for(int i : l)
		{
			
			if(i%2==0)
			{
				even.add(i);
			}
			else
			{
				odd.add(i);
			}
		}
		System.out.println("Original List: "+l);
		System.out.println("List of odd nuumbers: "+odd);
		System.out.println("List of even nuumbers: "+even);
		
	}
}