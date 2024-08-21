public class College
{
	int cid;
	String cname;
	University u;
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	public void setU(University u)
	{
		this.u=u;
	}
	
	public int getCid()
	{
		return cid;
	}
	public String getCname()
	{
		return cname;
	}
	public University getU()
	{
		return u;
	}
}