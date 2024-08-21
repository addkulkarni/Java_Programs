public class D extends C
{
	public D(String s, float f, double d)
	{
		super(5.5f);
		m6((short)56);
		System.out.println("Constructor-String-float-double-D");
	}
	public void m6(short s)
	{
		System.out.println("m6-short-D");
	}
	
}