public class Test
{
	public static void main(String args[])
	{
		Address ad = new Address();
		ad.cityname="Wardha";
		ad.areaname="Kelkarwadi";
		Student st = new Student();
		st.rollno=107;
		st.name="Aditya";
		st.a=ad;
		
		System.out.println(st.rollno);
		System.out.println(st.name);
		System.out.println(st.a.cityname);
		System.out.println(st.a.areaname);
	}
}