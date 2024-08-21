public class Account
{
	private int accno;
	private String acctype;
	private Person p;
	
	public void setAccno(int accno)
	{
		this.accno=accno;
	}
	public void setAcctype(String acctype)
	{
		this.acctype=acctype;
	}
	public void setP(Person p)
	{
		this.p=p;
	}
	
	public int getAccno()
	{
		return accno;
	}
	public String getAcctype()
	{
		return acctype;
	}
	public Person getP()
	{
		return p;
	}

}