public class B
{
	public static void m5(byte b1, byte b2)
	{
		System.out.println("m5--B");
		A a = new A();
		a.m1(25.5f);	
		A.m2("SDF",345.56d);
		A.m3(45, 45.6f, "RTF");
		a.m4(true , true);
	}

	public void m6(short s1, boolean b)
	{
		A a = new A();
		a.m1(45.1f);
		A.m2("SDF", 346.4f);
		A.m3(345, 35.6f , "RFH");
		a.m4(false , false);
		m5((byte)23 ,(byte) 45);
	}

	public static void main(String args[])
	{
		m5((byte)23,(byte)45);
		B b = new B();		
	}

		
}