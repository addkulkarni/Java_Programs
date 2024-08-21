public class Batch
{
	private int bid;
	private String bname;
	private Faculty f;
	
	public void setBid(int bid)
	{
		this.bid=bid;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setF(Faculty f)
	{
		this.f=f;
	}
	
	public int getBid()
	{
		return bid;
	}
	public String getBname()
	{
		return bname;
	}
	public Faculty getF()
	{
		return f;
	}
}