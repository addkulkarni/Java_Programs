class A
{
	public void m1()
	{
		System.out.println("m1--- A");
	}
}

class B
{
	public void m1()
	{
		System.out.println("m1--- B");
	}
}

class Test
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		a.m1();
		b.m1();
	}
}