import java.util.*;

public class User
{
	public static void main(String args[])
	{
		Map<String, String> m = new HashMap<>();
		m.put("aditya","Aditya@123");
		m.put("vishal","Vishal@123");
		m.put("pankaj","Pankaj@123");
		
		Set<String> s = m.keySet();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			String val = m.get(key);
			System.out.println(key+" "+val);
		}
		
		System.out.println();
		for(String key : s)
		{
			String val = m.get(key);
			System.out.println(key+" "+val);
		}
		System.out.println();
		m.forEach((key, val)->System.out.println(key+" "+val));
	}
}