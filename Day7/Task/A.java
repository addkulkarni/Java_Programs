public class A
{
	public void m1(float f)
	{
		System.out.println("m1--A");
	}

	public static void m2(String s, double d)
	{
		System.out.println("m2--A");
		A a= new A();
		a.m1(1.5f);
	}

	public static void m3(int i, float f, String s)
	{
		System.out.println("m3--A");
		A a = new A();
		a.m1(2.5f);
		m2("ABC", 134.7d);
	}

	public void m4(boolean a, boolean b)
	{
		System.out.println("m4--A");
		m1(25.7f);
		m2("XYZ", 35.786d);
		m3(45, 45.2f, "WER");
	}

	public static void main(String args[])
	{
		
	}
}