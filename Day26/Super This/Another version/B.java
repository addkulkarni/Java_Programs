public class B extends A
{
	public B()
	{	
		super("ABC", 5.5f);
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
		this.m4("ABC");
		System.out.println("m3-boolean-boolean-B");
	}
	public void m4(String s)
	{
		System.out.println("m4-String-B");
	}
	
}