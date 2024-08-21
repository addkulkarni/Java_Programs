import java.util.*;

public class D
{
	public static void main(String args[])
	{
		int []a = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		List<Integer> sq = new ArrayList<>();
		
		for(int i : a)
		{
			sq.add(i*i);
		}
		
		System.out.println("Square element list is: "+ sq);
	}
}