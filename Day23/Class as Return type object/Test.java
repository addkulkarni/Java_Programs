public class Test
{
	public Product m1()
	{
		Product p = new Product();
		p.pid=101;
		p.pname="Adidas";
		p.pprice=1005.54f;
		p.prank=1;
		return p;
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		Product p1=t.m1();
		System.out.println(p1.pid);
		System.out.println(p1.pname);
		System.out.println(p1.pprice);
		System.out.println(p1.prank);
		
	}
}