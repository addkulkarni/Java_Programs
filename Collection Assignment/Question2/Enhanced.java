import java.util.*;

public class Enhanced
{
	public static void main(String args[])
	{
		List<String> mh = new ArrayList<>();
		List<String> mp = new ArrayList<>();
		
		mh.add("Mumbai");
		mh.add("Pune");
		mh.add("Nagpur");
		mp.add("Bhopal");
		mp.add("Indore");
		
		List<List<String>> india = new ArrayList<>();
		india.add(mh);
		india.add(mp);
		
		for(List<String> a:india)
		{
			for(String b: a)
			{
				System.out.println(b);
			}
		}
	}
}