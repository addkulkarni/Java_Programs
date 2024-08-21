public class A
{
	float rollno=10;
	public static void main(String ar[])
	{
		A a = new A();
		a.rollno = 134.5f;
		System.out.println(a.rollno);
		A a1 = new A();
		System.out.println(a.rollno);
		int j=5;
		System.out.println(j);
	}
}