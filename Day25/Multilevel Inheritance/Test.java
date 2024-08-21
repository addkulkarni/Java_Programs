public class Test
{
	public static void main(String args[])
	{
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println();
		
		A a1 = new B();
		a1.m1();
		a1.m2();
		a1.m3();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println();
		
		A a2 = new C();
		a2.m1();
		a2.m2();
		a2.m3();
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println();
		
		A a3 = new D();
		a3.m1();
		a3.m2();
		a3.m3();
		System.out.println(a3.a);
		System.out.println(a3.b);
		System.out.println();
		
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println();
		
		B b1 = new C();
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println();
		
		B b2 = new D();
		b2.m1();
		b2.m2();
		b2.m3();
		b2.m4();
		System.out.println(b2.a);
		System.out.println(b2.b);
		System.out.println();
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println();
		
		C c1 = new D();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		c1.m5();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println();
		
		D d = new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m5();
		d.m6();
		System.out.println(d.a);
		System.out.println(d.b);
	}
}