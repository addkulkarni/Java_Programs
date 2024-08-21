public class Student
{
	int sid;
	String sname;
	Branch b;
	
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public void setB(Branch b)
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
	public Branch getB()
	{
		return b;
	}
}