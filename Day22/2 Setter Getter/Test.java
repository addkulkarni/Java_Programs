public class Test
{
	public static void main(String args[])
	{
		Course co = new Course();
		co.setCid(101);
		co.setCname("Angular");
		
		Faculty fa = new Faculty();
		fa.setFid(13007028);
		fa.setFname("Maximillian");
		fa.setC(co);
		
		Batch ba = new Batch();
		ba.setBid(177);
		ba.setBname("Full Day");
		ba.setF(fa);
		
		Student st = new Student();
		st.setSid(7);
		st.setSname("Aditya");
		st.setScontact(8888031890l);
		st.setB(ba);
		  
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getScontact());
		System.out.println(st.getB().getBid());
		System.out.println(st.getB().getBname());
		System.out.println(st.getB().getF().getFid());
		System.out.println(st.getB().getF().getFname());
		System.out.println(st.getB().getF().getC().getCid());
		System.out.println(st.getB().getF().getC().getCname());
	}
}