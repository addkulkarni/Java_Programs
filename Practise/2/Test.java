public class Test
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.setId(108);
		e.setName("Aditya");
		e.setSalary(190200);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}