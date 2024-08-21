import java.util.*;
public class Test
{
	public static void main(String args[])
	{
		Customer c1 = new Customer();
		c1.id=4;
		c1.name="ABC";
		c1.mobno=8888031890l;
		Customer c2 = new Customer();
		c2.id=2;
		c2.name="PQR";
		c2.mobno=8668778806l;
		Customer c3 = new Customer();
		c3.id=3;
		c3.name="JKL";
		c3.mobno=7878909876l;
		
		Set<Customer> s = new TreeSet<>();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		
		for(Customer a: s)
		{
			
			System.out.println(a.id);
			System.out.println(a.name);
			System.out.println(a.mobno);
		}
	}
}