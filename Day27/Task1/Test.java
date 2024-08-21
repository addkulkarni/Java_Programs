public class Test
{
	public static void main(String args[])
	{
		A a = new A(20.2f,'A');
		System.out.println(a.y);
		B b = new B();
		a.m1("true");
		B b1 = new B("XYZ", 20);
		System.out.println(b1.p);
		C c = new C();
		B b2 = new B('p', "XYZ");
		double l = b1.m1("int x");
		C c1 = new C("PQR");
		System.out.println(b2.m3(null));
		System.out.println(l);
	}
}