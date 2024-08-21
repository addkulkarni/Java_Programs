public class Test
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		B b1 = new B();
		B b2 = new C();
		B b3 = new D();
		C c1 = new C();
		C c2 = new D();
		D d1 = new D();
		System.out.println("---a1 object---");
		a1.m1();
		a1.m2();
		System.out.println("---a2 object---");
		a2.m1();
		a2.m2();
		System.out.println("---a3 object---");
		a3.m1();
		a3.m2();
		System.out.println("---a4 object---");
		a4.m1();
		a4.m2();
		System.out.println("---b1 object---");
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();
		System.out.println("---b2 object---");
		b2.m1();
		b2.m2();
		b2.m3();
		b2.m4();
		System.out.println("---b3 object---");
		b3.m1();
		b3.m2();
		b3.m3();
		b3.m4();
		System.out.println("---c1 object---");
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		c1.m5();
		c1.m6();
		System.out.println("---c2 object---");
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		c2.m5();
		c2.m6();
		System.out.println("---d1 object---");
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
		d1.m5();
		d1.m6();
		d1.m7();
		d1.m8();
	}
}