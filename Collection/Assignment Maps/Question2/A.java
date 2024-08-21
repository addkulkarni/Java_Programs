import java.util.*;

public class A
{
	public static void main(String args[])
	{
		Map m = new HashMap();
		m.put(1,88);
		m.put(10.5,"pqr");
		m.put('c',"xyz");
		
		Set<Character> s = m.keySet();
		Iterator<Character> itr = s.iterator();
		/*while(itr.hasNext())
		{
			char key = itr.next();
			String val = m.get(key);
			System.out.println(key+" "+val);
		}
		
		for(char c : s)
		{
			String st = m.get(c);
			System.out.println(c+" "+st);
		}
		*/
		m.forEach((key, val)->System.out.println(key+" "+val));
	}
}