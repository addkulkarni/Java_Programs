public class Test
{
	public static void main(String args[])
	{
		Address ad = new Address();
		ad.setCityname("Wardha");
		ad.setAreaname("Kelkarwadi");
		
		University un = new University();
		un.setUid(193810);
		un.setUname("SGAU");
		un.setA(ad);
		
		College co = new College();
		co.setCid(198707);
		co.setCname("GCOEA");
		co.setU(un);
		
		Branch br = new Branch();
		br.setBid(007);
		br.setBname("IT");
		br.setC(co);
		
		Student st = new Student();
		st.setSid(1);
		st.setSname("Aditya Kulkarni");
		st.setB(br);
		
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getB().getBid());
		System.out.println(st.getB().getBname());
		System.out.println(st.getB().getC().getCid());
		System.out.println(st.getB().getC().getCname());
		System.out.println(st.getB().getC().getU().getUid());
		System.out.println(st.getB().getC().getU().getUname());
		System.out.println(st.getB().getC().getU().getA().getCityname());
		System.out.println(st.getB().getC().getU().getA().getAreaname());
	}
}