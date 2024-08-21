public class Test
{
	public static void main(String args[])
	{
		Data d = new Data();
		User u1 = d.details();
		System.out.println(u1.id);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.gender);
	}
}