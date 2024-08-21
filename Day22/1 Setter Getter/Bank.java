public class Bank
{
	private int bid;
	private String bname;
	private long bcontact;
	private AccountHolder ah;
	
	public void setBid(int bid)
	{
		this.bid=bid;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setBcontact(long bcontact)
	{
		this.bcontact=bcontact;
	}
	public void setAh(AccountHolder ah)
	{
		this.ah=ah;
	}
	
	public int getBid()
	{
		return bid;
	}
	public String getBname()
	{
		return bname;
	}
	public long getBcontact()
	{
		return bcontact;
	}
	public AccountHolder getAh()
	{
		return ah;
	}
}