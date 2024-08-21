public class Employee
{
	int eid;
	String ename;
	float esalary;
	Address a;
	
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public void setEsalary(float esalary)
	{
		this.esalary=esalary;
	}
	public void setA(Address a)
	{
		this.a=a;
	}
	
	public int getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return ename;
	}
	public float getEsalary()
	{
		return esalary;
	}
	public Address getA()
	{
		return a;
	}
}