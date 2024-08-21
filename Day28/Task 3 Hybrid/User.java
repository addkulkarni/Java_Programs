public class User
{
	private int id;
	private String name;
	private int age;
	private char gender;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public char getGender()
	{
		return gender;
	}
}