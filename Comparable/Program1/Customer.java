

public class Customer implements Comparable<Customer>
{
	int id;
	String name;
	long mobno;
	
	public int compareTo(Customer c)
	{
		//return this.id-c.id;
		//return this.name.compareTo(c.name);
		return (int)(this.mobno-c.mobno);
	}
}