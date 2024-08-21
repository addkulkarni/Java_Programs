import java.util.*;

public class E
{
	public static void main(String args[])
	{
		List<String> l = new ArrayList<>();
		l.add("ABC");
		l.add("X");
		l.add("Bhuvaneshwar");
		l.add("Pune");
		l.add("Mumbai");
		
		
		String s[] = new String[l.size()];
		String s_long="";
		
		for(int i=0; i<s.length; i++)
		{
			String st = l.get(i);
			
			s[i]=st;
		}
		
		int len = 0;
		for(String st: s)
		{
			
			if(st.length()>len)
			{
				len = st.length();
				
				s_long = st;
			}
		}
		System.out.println("Longest String is: "+s_long);
		
	} 
}