import java.util.*;

public class C
{
	public static void main(String args[])
	{
		Set<String> mh = new HashSet<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		Set<String> mp = new HashSet<>();
		mp.add("Bhopal");
		mp.add("Indore");
		
		Map<String, Set<String>> india = new HashMap<>();
		india.put("Maharashtra", mh);
		india.put("Madhya Pradesh", mp);
		
		Set<String> s = india.keySet();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key);
			Set<String> state = india.get(key);
			Iterator<String> itr2 = state.iterator();
			{
				while(itr2.hasNext())
				{
					String city = itr2.next();
					System.out.println(city);
				}
			}
		}
		
		for(String )
		
	}
}