public class Manager
{
	private int id;
	private String name;
	private double salary;
	private String qualification;
	private String branchName;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setQualification(String qualification)
	{
		this.qualification=qualification;
	}
	public void setBranchName(String branchName)
	{
		this.branchName=branchName;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getQualification()
	{
		return qualification;
	}
	public String getBranchName()
	{
		return branchName;
	}
}