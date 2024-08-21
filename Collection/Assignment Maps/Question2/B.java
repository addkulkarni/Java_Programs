import java.util.*;

public class B
{
	public static void main(String args[])
	{
		Map<Integer, String> m = new HashMap<>();
		m.put(1,"abc");
		m.put(2,"pqr");
		m.put(3,"xyz");
		
		Set<Integer> s = m.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			int key = itr.next();
			String val = m.get(key);
			System.out.println(key+" "+val);
		}
		
		for(int key : s)
		{
			String val = m.get(key);
			System.out.println(key+" "+val);
		}
		
		m.forEach((key, val)->System.out.println(key+" "+val));
	}
}