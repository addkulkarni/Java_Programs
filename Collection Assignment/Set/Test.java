
import java.util.*;

public class Test
{
	public static void main(String args[])
	{
		Set<Double> wholeValues = new LinkedHashSet<>();
		Set<Double> decimalValues = new LinkedHashSet<>();
		wholeValues.add(10d);
		wholeValues.add(20d);
		decimalValues.add(20.2d);
		decimalValues.add(50.5d);
		
		Set<Set<Double>> doubleValues = new LinkedHashSet<>();
		doubleValues.add(wholeValues);
		doubleValues.add(decimalValues);
		
		Iterator<Set<Double>> itr = doubleValues.iterator();
		while(itr.hasNext())
		{
			Set<Double> a = itr.next();
			Iterator<Double> itr2 = a.iterator();
			while(itr2.hasNext())
			{
				Double d = itr2.next();
				System.out.println(d);
			}
		}
		
		System.out.println();
		
		for(Set<Double> d: doubleValues)
		{
			for(Double dd : d)
			{
				System.out.println(dd);
			}
		}
		
		System.out.println();
		
		doubleValues.forEach(a->a.forEach(b->System.out.println(b)));
		
	}
}