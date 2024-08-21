package maharashtraboard;
import mumbai.university.college.Student1;
import pune.university.college.Student2;

public class Test
{
	public static void main(String args[])
	{
		System.out.println("Main--Test");
		Student1 st1 = new Student1();
		Student2 st2 = new Student2();
		st1.studentDetails();
		st2.studentDetails();
	}
}