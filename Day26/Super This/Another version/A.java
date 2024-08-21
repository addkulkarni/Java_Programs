public class A
{
	public A(int i)
	{
		m2((byte)5);
		System.out.println("Constructor-int-A");
	}
	public A(String s, float f)
	{
		this(5);
		System.out.println("Constructor-String-float-A");
	}
	public void m1(double d)
	{
		System.out.println("m1-double-A");
	}
	public void m2(byte b)
	{
		m1(10.2d);
		System.out.println("m2-byte-A");
	}
}