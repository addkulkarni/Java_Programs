public class Student
{
	private int sid;
	private String sname;
	private long scontact;
	private Batch b;
	
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public void setScontact(long scontact)
	{
		this.scontact=scontact;
	}
	public void setB(Batch b)
	{
		this.b=b;
	}
	
	public int getSid()
	{
		return sid;
	}
	public String getSname()
	{
		return sname;
	}
	public long getScontact()
	{
		return scontact;
	}
	public Batch getB()
	{
		return b;
	}
}