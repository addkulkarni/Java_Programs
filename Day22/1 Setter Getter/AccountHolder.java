public class AccountHolder
{
	private int ahid;
	private String ahname;
	private long ahmob;
	private Address a;
	
	public void setAhid(int ahid)
	{
		this.ahid=ahid;
	}
	public void setAhname(String ahname)
	{
		this.ahname=ahname;
	}
	public void setAhmob(long ahmob)
	{
		this.ahmob=ahmob;
	}
	public void setA(Address a)
	{
		this.a=a;
	}
	
	public int getAhid()
	{
		return ahid;
	}
	public String getAhname()
	{
		return ahname;
	}
	public long getAhmob()
	{
		return ahmob;
	}
	public Address getA()
	{
		return a;
	}
}