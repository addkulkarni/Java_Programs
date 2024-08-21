public class B
{
	public static void main(String args[])
	{
		int i = 10;
		int j = 20;
		System.out.println(++i);  //11
		System.out.println(j++);  //20
		System.out.println(j);    //21

		i=++i;   	          // i=11
		System.out.println(i);    //11

		j= j++;
		System.out.println(j);    //21
	}
}