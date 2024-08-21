public class Test
{
	public void m1(Product p)
	{
		System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getPprice());
		System.out.println(p.getPrank());
	}

	public static void main(String args[])
	{
		Test t = new Test();
		Product p1 = new Product();
		p1.setPid(101);
		p1.setPname("Aditya");
		p1.setPprice(1098.6f);
		p1.setPrank(1);
		t.m1(p1);
	}
}