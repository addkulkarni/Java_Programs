public class C extends B
{
	public C()
	{
		super(true);
	}
	public C(String s, double d)
	{
		this.m5(10l,10.5f,"ABC");
		System.out.println("Constructor-String-Double-C");
	}
	public C(float f)
	{
		this("ABC",10.5d);
		System.out.println("Constructor-float-C");
	}
	
	public void m5(long l, float f, String s)
	{
		B b = new B(false);
		System.out.println("m5-long-float-String-C");
	}
}