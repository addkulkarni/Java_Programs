public class A
{
	public void m1()
	{
		System.out.println("m1--A");
	}
	public void m2()
	{
		this.m1();
		System.out.println("m2--A");
	}
}