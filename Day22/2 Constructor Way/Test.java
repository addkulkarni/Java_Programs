public class Test
{
	public static void main(String args[])
	{
		  Course co = new Course(101,"Angular");
		  Faculty fa = new Faculty(13007028,"Maximillian",co);		  
		  Batch ba = new Batch(177,"Full Day",fa);
		  Student st = new Student(36,"Aditya",8668778806l,ba);
		  
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