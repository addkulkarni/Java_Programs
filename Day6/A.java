public class A
{
	public void m1(int i, float j)
	{
		System.out.println("m1--A");
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String args[])
	{
		A a = new A();
		a.m1(100,1234567.8f);
	}
}