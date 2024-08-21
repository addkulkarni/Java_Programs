import java.util.*;

public class City
{
	public static void main(String args[])
	{
		Map<Integer, String> m = new HashMap<>();
		m.put(442001,"Wardha");
		m.put(400092,"Borivali");
		m.put(442010,"Nagpur");
		
		Set<Integer> s = m.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			int key = itr.next();
			String city = m.get(key);
			System.out.println(key+" "+city);
		}
		
		System.out.println();
		for(int key : s)
		{
			String city = m.get(key);
			System.out.println(key+" "+city);
		}
		
		System.out.println();
		m.forEach((key, val)->System.out.println(key+" "+val));
	}
}