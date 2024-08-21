import java.util.*;

public class Lambda
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		List<String> mh = new ArrayList<>();
		List<String> mp = new ArrayList<>();
		mh.add(sc.next());
		mh.add(sc.next());
		mh.add(sc.next());
		mp.add(sc.next());
		mp.add(sc.next());
		
		List<List<String>> india = new ArrayList<>();
		india.add(mh);
		india.add(mp);
		
		india.forEach(a -> a.forEach(b->System.out.println(b)));
	}
}