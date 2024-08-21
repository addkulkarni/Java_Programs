public class B extends A
{
	public B()
	{
		this("ABC");
		System.out.println("Constructor B");
	}
	
	public B(int i)
	{
		System.out.println("COnstructor B int");
	}
	
	public B(String s)
	{
		this(5);
		System.out.println("COnstructor B String");
	}
	
}