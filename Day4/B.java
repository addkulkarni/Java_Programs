public class B
{
	byte b = 12;
	short s = 114;
	int i = 1289;
	long l = 19870;
	float f = 0.3f;
	double d = 29.2938191;
	char c = 'f';
	boolean flag = true;

	public static void main(String args[])
	{
		B b = new B();
		System.out.println("Value of byte = "+ b.b);
		System.out.println("Value of short = "+ b.s);
		System.out.println("Value of int = "+ b.i);
		System.out.println("Value of long = "+ b.l);
		System.out.println("Value of float = "+ b.f);
		System.out.println("Value of double = "+ b.d);
		System.out.println("Value of char = "+ b.c);
		System.out.println("Value of boolean = "+ b.flag);
	}
}