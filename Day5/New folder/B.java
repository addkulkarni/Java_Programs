public class B
{
	public void m4()
	{
		A a = new A();
		a.m3();
		System.out.println("B--- m4");
	}

	public void m5()
	{
		m4();
		System.out.println("B--- m5");
	}

	public void m6()
	{
		m5();
		System.out.println("B--- m6");
	}
}