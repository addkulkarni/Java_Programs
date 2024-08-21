public class Test
{
	public static void main(String args[])
	{
		A a = new A();
		a.m1(35.5f);
		A.m2("ABC",34.56);
		A.m3(345, 45.6f, "ASD");
		a.m4(true, true);

		B b = new B();
		B.m5((byte)23,(byte)45);
		b.m6((short)34,true);
	}
}

