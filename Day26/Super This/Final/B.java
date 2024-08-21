public class B extends A
{
	public B()
	{
		super("ABC",10.5f);
		m3(true, true);
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
		System.out.println("m3-B");
	}
	
	public void m4(String s)
	{
		System.out.println("m4-A");
	}
}