public class A
{
	public void m1()
	{
		System.out.println("A--- m1");
	}
	
	public void m2()
	{
		m1();
		System.out.println("A--- m2");
	}

	public void m3()
	{
		m2();
		System.out.println("A--- m3");
	}
}