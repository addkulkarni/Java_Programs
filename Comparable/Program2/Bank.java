public class Bank implements Comparable <Bank>
{
	private String bname;
	private String branch;
	private String addr;
	private Account acc;
	
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public void setAddr(String addr)
	{
		this.addr=addr;
	}
	public void setAcc(Account acc)
	{
		this.acc=acc;
	}
	
	public String getBname()
	{
		return bname;
	}
	public String getBranch()
	{
		return branch;
	}
	public String getAddr()
	{
		return addr;
	}
	public Account getAcc()
	{
		return acc;
	}

	public int compareTo(Bank b)
	{
		return -(this.bname.compareTo(b.bname));
		//return this.paddr.compareTo(p.paddr);
		//return (int)(this.pmob-p.pmob);
	}
	
}