public class Patient
{
	private int id;
	private String name;
	private String address;
	private long mobno;
	private String disease;
	
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
	public void setMobno(long mobno)
	{
		this.mobno=mobno;
	}
	public void setDisease(String disease)
	{
		this.disease=disease;
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
	public long getMobno()
	{
		return mobno;
	}
	public String getDisease()
	{
		return disease;
	}
}
