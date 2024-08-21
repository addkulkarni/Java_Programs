public class Developer
{
	private int id;
	private String name;
	private String address;
	private double salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public double getSalary()
	{
		return salary;
	}
}