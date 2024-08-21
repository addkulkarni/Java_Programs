public class A
{
	public A (int i,float f,boolean b)
	{
		System.out.println("Correct1");
	}

	public A (boolean b,float f,int i)
	{
		System.out.println("Correct2");
	}

	public A (float f,boolean b, int i)
	{
		System.out.println("Correct3");
	}
	
	public A (String s, int i, boolean b)
	{
		System.out.println("Correct4");
	}
	
	public A (int i,boolean b,String s)
	{
		System.out.println("Correct5");
	}

	public A (boolean b, int i,String s)
	{
		System.out.println("Correct6");
	}
	
	public A (String s, int i, float f)
	{
		System.out.println("Correct7");
	}

	public A (float f, String s, int i)
	{
		System.out.println("Correct8");
	}

	public A (int i , String s, float f)
	{
		System.out.println("Correct9");
	}

	public A (float f, int i, boolean b)
	{
		System.out.println(f+" "+i+" "+b);
	}


	public static void main(String args[])
	{
		A a1 =new A(10,10.10f,true);
		A a2 =new A(true,10.10f,10);
		A a3 =new A(10.10f,true,10);
		A a4 =new A("ABC",10,true);
		A a5 =new A(10,true,"ABC");
		A a6 =new A(true,10,"ABC");
		A a7 =new A("ABC",10,10.10f);
		A a8 =new A(10.10f,"ABC",10);
		A a9 =new A(10,"ABC",10.10f);
		A a10 =new A(10.10f,(byte)10,true);
	}
}