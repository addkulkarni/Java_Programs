import java.util.*;
public class E
{
	public static void main(String args[])
	{
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> mp = new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indore");
		
		List<String> abc = new ArrayList<>();
		abc.add("Tokyo");
		abc.add("Hiroshima");
		
		List<String> pqr = new ArrayList<>();
		pqr.add("Nagasaki");
		pqr.add("Fukushima");
		
		Set<List<String>> india = new HashSet<>();
		india.add(mh);
		india.add(mp);
		
		Set<List<String>> japan = new HashSet<>();
		japan.add(abc);
		japan.add(pqr);
		
		Map<String, Set<List<String>>> world = new HashMap<>();
		world.put("India", india);
		world.put("Japan", japan);
		
		
		Set<String> set1 = world.keySet();
		for(String s1: set1)
		{
			System.out.println(s1);
			Set<List<String>> set2 = world.get(s1);
			for(List<String> list1 : set2)
			{
			
				for(String s2 : list1)
				{
					System.out.println(s2);
				}
			}
		}
	}
}