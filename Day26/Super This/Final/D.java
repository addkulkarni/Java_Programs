public class D extends C
{
	public D(String s, float f, double d)
	{
		super(5.3f);
		m6((short)10);
		System.out.println("Constructor-String-float-double");
	}
	
	public void m6(short s)
	{
		System.out.println("m6-D");
	}
}