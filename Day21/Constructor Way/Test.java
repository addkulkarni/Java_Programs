public class Test
{
	public static void main(String args[])
	{
		Address adr = new Address("Pune", "Warje", 442001);
		Employee e = new Employee(1, "ABC" , 2086.73f , adr);
		
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.esalary);
		System.out.println(e.a.cityname);
		System.out.println(e.a.areaname);
		System.out.println(e.a.pincode);
		
	}
}