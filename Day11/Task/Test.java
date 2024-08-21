public class Test
{
	public static void main(String args[])
	{
		boolean schoolStatus = true;
		School sc = new School();
		Teacher t = new Teacher();
		Student st = new Student();
		if(schoolStatus)
		{
			System.out.println("\nSchool details are as follows");
			System.out.println("------------------------------");
			sc.schoolDetails();
			
			boolean teacherStatus = true;
			if(teacherStatus)
			{
				System.out.println("Teacher details are as follows");
				System.out.println("------------------------------");
				t.teacherDetails();
				
				boolean studentStatus = true;
				if(studentStatus)
				{
					System.out.println("Student details are as follows");
					System.out.println("------------------------------");
					st.studentDetails();
					
				
				}
				else
				{
					System.out.println("Student is invalid");
				}
			}
			else
			{
				System.out.println("Teacher is invalid");
			}
		}
		else
		{
			System.out.println("School is invalid");
		}
	}
}