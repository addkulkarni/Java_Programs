public class Faculty
{
	private int fid;
	private String fname;
	private Course c;
	
	public void setFid(int fid)
	{
		this.fid=fid;
	}
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public void setC(Course c)
	{
		this.c=c;
	}
	
	public int getFid()
	{
		return fid;
	}
	public String getFname()
	{
		return fname;
	}
	public Course getC()
	{
		return c;
	}
}