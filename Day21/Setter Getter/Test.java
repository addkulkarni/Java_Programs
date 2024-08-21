public class Test
{
	public static void main(String args[])
	{
		Address adr = new Address();
		adr.setCityname("Pune");
		adr.setAreaname("Warje");
		adr.setPincode(442001);
		
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Aditya");
		e.setEsalary(3798.828f);
		e.setA(adr);
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getEsalary());
		System.out.println(e.getA().getCityname());
		System.out.println(e.getA().getAreaname());
		System.out.println(e.getA().getPincode());
			
		
	}
}