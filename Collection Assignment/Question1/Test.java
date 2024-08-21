
import java.util.*;

public class Test
{
	public static void main(String args[])
	{
		List<Student> ls = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<1; i++)
		{
			Student s = new Student();
			System.out.println("Enter roll no");
			s.setRollno(sc.nextInt());
			System.out.println("Enter name");
			s.setName(sc.next());
			System.out.println("Enter address");
			s.setAddr(sc.next());
			System.out.println("Enter mobile no");
			s.setMobileno(sc.nextLong());
			System.out.println("Enter college fees");
			s.setClgfees(sc.nextDouble());
			System.out.println("Enter marks");
			s.setMarks(sc.nextFloat());
			System.out.println("Enter college name");
			s.setClgname(sc.next());
			ls.add(s);
		}
		
		Iterator<Student> itr = ls.iterator();
		while(itr.hasNext())
		{
			Student stu = itr.next();
			System.out.println(stu.getRollno()+" "+stu.getName()+" "+stu.getAddr()+" "+stu.getMobileno()+" "+stu.getClgfees()+" "+stu.getMarks()+" "+stu.getClgname());	
		}
		
		for(Student stu:ls)
		{
			System.out.println(stu.getRollno()+" "+stu.getName()+" "+stu.getAddr()+" "+stu.getMobileno()+" "+stu.getClgfees()+" "+stu.getMarks()+" "+stu.getClgname());
		}
	}
}