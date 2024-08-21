package com.commandline;
public class A
{
	public static void main(String args[])
	{
	
		for(int i=0; i<args.length; i++)
		System.out.println(args[i]);
		A a = new A();
		a.main();
	}
	
	public void main()
	{
		System.out.println("Another main");
	}
}