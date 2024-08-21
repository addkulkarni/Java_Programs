public class College
{
	public void studentDetails(int r,String n,String a,long m)
	{
		Student s = new Student(1,"Sunanda");
		s.rollno = r;
		s.name = n;
		s.address = a;
		s.mobno = m;
		System.out.println("Student details are:\n"+ s.rollno+"\n"+s.name+"\n"+s.address+"\n"+s.mobno);
	}

	public void collegeDetails(int c_id , String c_name)
	{
		System.out.println("College ID: "+c_id+"\nCollege Name:"+c_name);
	}
}