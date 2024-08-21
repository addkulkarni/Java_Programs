public class Info
{
	public Developer setData()
	{
		Developer d = new Developer();
		d.setId(1);
		d.setName("Aditya");
		d.setAddress("Pune");
		d.setSalary(100000.0);
		return d;
	}
	
	public void getData(Developer d)
	{
		System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println(d.getAddress());
		System.out.println(d.getSalary());
	}
}