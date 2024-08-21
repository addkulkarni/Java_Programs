public class Test
{
	public Product m1()
	{
		Product p = new Product();
		p.setPid(101);
		p.setPname("Adidas");
		p.setPprice(1086.6f);
		p.setPrank(1);
		return p;
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		Product p1 = t.m1();
		System.out.println(p1.getPid());
		System.out.println(p1.getPname());
		System.out.println(p1.getPprice());
		System.out.println(p1.getPrank());
		
	}
}