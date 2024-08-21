public class Test
{
	public static void main(String args[])
	{
		Address adr = new Address();
		adr.cityname = "Pune";
		adr.areaname = "Warje";
		adr.pincode = 442001;
		
		Employee e = new Employee();
		e.eid = 1;
		e.ename = "Aditya";
		e.esalary = 20076.5f;
		e.a = adr;
		
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.esalary);
		System.out.println(e.a.cityname);
		System.out.println(e.a.areaname);
		System.out.println(e.a.pincode);
	}
}