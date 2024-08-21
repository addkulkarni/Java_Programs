public class B extends A
{
	public void m1()
	{
		this.m3();
		System.out.println("m1--B");
	}
	public void m3()
	{
		System.out.println("m3--B");
	}
}