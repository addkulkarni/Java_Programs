public class D extends C
{
	public D(String s, float f, double d)
	{
		m6((short)56);
		System.out.println("Constructor-String-float-double-D");
	}
	public void m6(short s)
	{
		C c = new C(10.5f);
		System.out.println("m6-short-D");
	}
	
}