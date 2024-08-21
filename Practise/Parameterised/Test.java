public class Test
{
	public void m1(A a1)
	{
		System.out.println(a1.getRollno());
		System.out.println(a1.getName());
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		A a = new A();
		a.setRollno(10);
		a.setName("Aditya");
		t.m1(a);
	}
}