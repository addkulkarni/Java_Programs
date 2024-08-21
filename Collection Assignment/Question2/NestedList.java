import java.util.*;
public class NestedList
{
	public static void main(String args[])
	{
		List<String> mh = new ArrayList<>();
		List<String> mp = new ArrayList<>();
		
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		mp.add("Bhopal");
		mp.add("Indore");
		
		List<List <String>> india = new ArrayList<>();
		india.add(mh);
		india.add(mp);
		
		Iterator<List<String>> itr = india.iterator();
		while(itr.hasNext())
		{
			List<String> a = itr.next();
			{
				Iterator<String> itr2 = a.iterator();
				while(itr2.hasNext())
				{
					String s = itr2.next();
					System.out.println(s);
				}
			}
		}
	}
}