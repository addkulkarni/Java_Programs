package com.aditya.programs;
import com.aditya.programs2.*;

public class Package1
{
	public static void main(String args[])
	{
		System.out.println("Main--Package1");
		Package2 p = new Package2();
		p.m1();
	}
}