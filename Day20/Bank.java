public class Bank
{
	private int id;
	private String name;
	private int noBranch;
	private long mobno;
	private String email;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNoBranch(int noBranch)
	{
		this.noBranch = noBranch;
	}
	public void setMobno(long mobno)
	{
		this.mobno=mobno;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getNoBranch()
	{
		return noBranch;
	}
	public long getMobno()
	{
		return mobno;
	}
	public String getEmail()
	{
		return email;
	}
}