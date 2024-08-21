public class Test
{
	public static void main(String args[])
	{
		Demo demo = new Demo();
		A a = demo.m1();
		System.out.println(a.i+" "+a.j);
		
		B b = (B)demo.m2();
		System.out.println(b.i+" "+b.j+" "+b.k+" "+b.l);
		
		C c = (C)demo.m3();
		System.out.println(c.i+" "+c.j+" "+c.k+" "+c.l+" "+c.x+" "+c.y);
		
		D d = (D)demo.m4();
		System.out.println(d.i+" "+d.j+" "+d.k+" "+d.l+" "+d.x+" "+d.y+" "+d.p+" "+d.q);
		
		B b1 = demo.m5();
		System.out.println(b1.i+" "+b1.j+" "+b1.k+" "+b1.l);
		
		C c1 = (C)demo.m6();
		System.out.println(c1.i+" "+c1.j+" "+c1.k+" "+c1.l+" "+c1.x+" "+c1.y);
		
		D d1 = (D)demo.m7();
		System.out.println(d1.i+" "+d1.j+" "+d1.k+" "+d1.l+" "+d1.x+" "+d1.y+" "+d1.p+" "+d1.q);
		
		C c2 = demo.m8();
		System.out.println(c2.i+" "+c2.j+" "+c2.k+" "+c2.l+" "+c2.x+" "+c2.y);
		
		D d2 = (D)demo.m9();
		System.out.println(d2.i+" "+d2.j+" "+d2.k+" "+d2.l+" "+d2.x+" "+d2.y+" "+d2.p+" "+d2.q);
		
		D d3 = demo.m10();
		System.out.println(d3.i+" "+d3.j+" "+d3.k+" "+d3.l+" "+d3.x+" "+d3.y+" "+d3.p+" "+d3.q);
		
	}
}