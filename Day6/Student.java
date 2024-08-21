public class Student
{
	int rollno;
	public void studentDetails()
	{
		System.out.println("Name: Aditya");
	}

	public static void main(String args[])
	{
		Student s = new Student();
		s.rollno = 10;
		s.studentDetails();
		System.out.println("Roll no: "+s.rollno);

		Student s1 =  new Student();
		s1.rollno = 20;
		s1.studentDetails();
		System.out.println("Roll no: "+s1.rollno);
	}
}