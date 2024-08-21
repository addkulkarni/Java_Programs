public class Test
{
	public static void main(String args[])
	{
		  Course co = new Course();
		  co.cid=101;
		  co.cname="Angular";
		  
		  Faculty fa = new Faculty();
		  fa.fid=13007028;
		  fa.fname="Max";
		  fa.c = co;
		  
		  Batch ba = new Batch();
		  ba.bid=177;
		  ba.bname="Full day";
		  ba.f = fa;
		  
		  Student st = new Student();
		  st.sid=36;
		  st.sname="Aditya";
		  st.scontact=8888031890l;
		  st.b=ba;
		  
		  System.out.println(st.sid);
		  System.out.println(st.sname);
		  System.out.println(st.scontact);
		  System.out.println(st.b.bid);
		  System.out.println(st.b.bname);
		  System.out.println(st.b.f.fid);
		  System.out.println(st.b.f.fname);
		  System.out.println(st.b.f.c.cid);
		  System.out.println(st.b.f.c.cname);
		  
		  
		  
		  
	}
}