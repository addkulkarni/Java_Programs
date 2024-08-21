public class Test
{
	public A m1()
	{
		A a = new A();
		a.setRollno(10);
		a.setName("Aditya Kulkarni");
		return a;
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		A a1=t.m1();
		System.out.println(a1.getRollno());
		System.out.println(a1.getName());
	}
}