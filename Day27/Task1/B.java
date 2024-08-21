public class B
{
	boolean p = false;
	public B()
	{
		System.out.println("Constructor-B");
	}
	public B(String s, int i)
	{
		System.out.println("Constructor-String-int-B");
	}
	public B(char c, String s)
	{
		System.out.println("Constructor-char-String-B");
	}
	public double m1(String s)
	{
		double d = 20.20d;
		//System.out.println("m1-B");
		return d;
	}
	public String m3(String s)
	{
		System.out.println("m3-B");
		return "X";
	}
}