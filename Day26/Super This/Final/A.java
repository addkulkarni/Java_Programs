public class A
{
	public A(int i)
	{
		m2((byte)20);
		System.out.println("Constructor-int-A");
	}
	
	public A(String s, float f)
	{
		this(10);
		System.out.println("Constructor-String-float-A");
	}
	
	public void m1(double d)
	{
		System.out.println("m1-A");
	}
	public void m2(byte b)
	{
		m1(10.5d);
		System.out.println("m2-A");
	}
}