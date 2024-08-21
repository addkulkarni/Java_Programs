public class Product
{
	private int pid;
	private String pname;
	private float pprice;
	private int prank;

	public void setPid(int pid)
	{
		this.pid=pid;
	}
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public void setPprice(float pprice)
	{
		this.pprice=pprice;
	}
	public void setPrank(int prank)
	{
		this.prank=prank;
	}

	public int getPid()
	{
		return pid;
	}
	public String getPname()
	{
		return pname;
	}
	public float getPprice()
	{
		return pprice;
	}
	public int getPrank()
	{
		return prank;
	}
}