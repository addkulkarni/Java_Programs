import java.util.*;

public class Cases3
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
		
		chars.forEach(a -> a.forEach(b-> System.out.println(b)));
		
	}
}