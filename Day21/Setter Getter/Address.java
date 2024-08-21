public class Address
{
	String cityname;
	String areaname;
	int pincode;
	
	public void setCityname(String cityname)
	{
		this.cityname = cityname;
	}
	public void setAreaname(String areaname)
	{
		this.areaname = areaname;
	}
	public void setPincode(int pincode)
	{
		this.pincode = pincode;
	}
	
	public String getCityname()
	{
		return cityname;
	}
	public String getAreaname()
	{
		return areaname;
	}
	public int getPincode()
	{
		return pincode;
	}
}