public class Admin
{
	public static void main(String args[])
	{
		Student s = new Student(1,"Shubham");
		Teacher t = new Teacher(14,"Kavita");
		College c = new College();
		c.studentDetails(1, "Aditya" , "Pune" , 8888031890l);
		c.collegeDetails(1, "C.O.E.P.");
	}
}