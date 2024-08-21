public class B extends A
{
	public B()
	{	
		this.m3(true, false);
		System.out.println("Constructor-B");
	}
	public B(boolean b)
	{
		this();
		System.out.println("Constructor-boolean-B");
	}
	public void m3(boolean b1, boolean b2)
	{
		m4("ABC");
		System.out.println("m3-boolean-boolean-B");
	}
	public void m4(String s)
	{
		A a = new A("ABC",10.5f);
		System.out.println("m4-String-B");
	}
	
}