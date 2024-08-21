public class Branch
{
	int bid;
	String bname;
	College c;
	
	public void setBid(int bid)
	{
		this.bid=bid;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setC(College c)
	{
		this.c=c;
	}
	public int getBid()
	{
		return bid;
	}
	public String getBname()
	{
		return bname;
	}
	public College getC()
	{
		return c;
	}
}