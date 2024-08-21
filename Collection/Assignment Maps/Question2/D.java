import java.util.*;

public class D
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
		
		Map<String, List<String>> india = new HashMap<>();
		india.put("Maharashtra", mh);
		india.put("Madhya Pradesh", mp);
		
		Map<String, List<String>> japan = new HashMap<>();
		japan.put("State1", abc);
		japan.put("State2", pqr);
		
		Map<String, Map<String, List<String>>> world = new HashMap<>();
		world.put("India", india);
		world.put("Japan", japan);
		
		Set<String> set1 = world.keySet();
		for(String s1 : set1)
		{
			System.out.println("---Country: "+s1+"---");
			Map<String, List<String>> m1 = world.get(s1);
			Set<String> set2 = m1.keySet();
			for(String s2: set2)
			{
				System.out.println("---State: "+s2+"---");
				List<String> list1 = m1.get(s2);
				for(String s3:list1)
				{
					System.out.println(s3);
				}
			}
		}
		
		System.out.println();		
		world.forEach((a,b)->b.forEach((c,d)->d.forEach(e->System.out.println(e))));
	}
}

