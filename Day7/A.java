public class A
{
	public void m1()
	{
		System.out.println("m1--A--non-static");
	}

	public void m2()
	{
		m1();
		System.out.println("m2--A--non-static");
	}
	
	public static void m3()
	{
		A a = new A();
		a.m2();
		System.out.println("m3--A--static");
	}

	public static void m4()
	{
		m3();
		System.out.println("m4--A--static");
	}
	
	public void m5()
	{
		m1();
		m2();
		m3();
		m4();
		System.out.println("m5--not--static");
	}	
}


