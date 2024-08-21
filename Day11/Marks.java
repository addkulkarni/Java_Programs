public class Marks
{
	public static void main(String args[])
	{
		int marks = 94;
		if(marks<40)
		{
			System.out.println("Student has failed");
		}
		
		else if(marks>=40 && marks<=65)
		{
			System.out.println("Grade: D");
		}

		else if(marks>=66 && marks<=75)
		{
			System.out.println("Grade: C");
		}
		
		else if(marks>=76 && marks<=90)
		{
			System.out.println("Grade: B");
		}
		
		else if(marks>=91 && marks<=100)
		{
			System.out.println("Grade: A");
		}
		
		else
		{
			System.out.println("Invalid Marks");	
		}
	}
}