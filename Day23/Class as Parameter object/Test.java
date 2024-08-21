public class Test
{
	public void m1(Product p1)
	{
		System.out.println(p1.pid);
		System.out.println(p1.pname);
		System.out.println(p1.pprice);
		System.out.println(p1.prank);
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		Product p = new Product();
		p.pid=101;
		p.pname="Adidas";
		p.pprice=1766.3f;
		p.prank=1;
		t.m1(p);
	}
}