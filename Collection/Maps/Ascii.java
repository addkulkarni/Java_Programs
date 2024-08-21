import java.util.*;

public class Ascii
{
	public static void main(String args[])
	{
		Map<Integer, Character> m = new HashMap<>();
		m.put(107,'k');
		m.put(65,'A');
		m.put(66,'B');
		m.put(97,'a');
		m.put(100,'d');
		m.put(67,'C');
		
		System.out.println(m);
		
		Set<Integer> s = m.keySet();
		Iterator <Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			int key = itr.next();
			char val = m.get(key);
			System.out.println(key+" "+val);
		}
		
		System.out.println();
		
		for(int key: s)
		{
			char val = m.get(key);
			System.out.println(key+" "+val);
		}
		 
		System.out.println();
		
		m.forEach((key, val)->System.out.println(key+" "+val));
	}
}