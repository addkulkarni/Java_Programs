import java.util.*;

public class Aadhar
{
	public static void main(String args[])
	{
		Map<Long, String> m = new HashMap<>();
		m.put(577834232032l, "Aditya");
		m.put(854785456325l, "Atharva");
		m.put(562312451256l, "Abhijeet");
		
		Set<Long> s = m.keySet();
		Iterator<Long> itr = s.iterator();
		while(itr.hasNext())
		{
			long num = itr.next();
			String name = m.get(num);
			System.out.println(num+" "+name);
		}
		
		System.out.println();
		for(long num : s)
		{
			String name = m.get(num);
			System.out.println(num+" "+name);
		}
		
		System.out.println();
		m.forEach((key, val)->System.out.println(key+" "+val));
	}
}