import java.util.*;

public class Cases
{
	public static void main(String args[])
	{
		List<String> lowerCase = new ArrayList<>();
		List<String> upperCase = new ArrayList<>();
		List<String> specialChar = new ArrayList<>();
		lowerCase.add("aditya");
		lowerCase.add("pankaj");
		lowerCase.add("aniket");
		upperCase.add("MANISH");
		upperCase.add("VISHAL");
		specialChar.add("!@#$");
		specialChar.add("*()&");
		
		List <List<String>> chars = new ArrayList<>();
		chars.add(lowerCase);
		chars.add(upperCase);
		chars.add(specialChar);
		
		
		Iterator<List<String>> itr = chars.iterator();
		while(itr.hasNext())
		{
			List<String> a = itr.next();
			Iterator<String> itr2 = a.iterator();
			while(itr2.hasNext())
			{
				String s = itr2.next();
				{
					System.out.println(s);
				}
			}
		}
	}
}