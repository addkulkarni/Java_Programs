import java.util.*;
public class College
{
	public static void main(String args[])
	{
		College c = new College();
		Map<String, List<Student>> eng = c.m1();
		
		Set<String> set = eng.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String key =itr.next();
			System.out.println(key);
			List<Student> l = eng.get(key);
			Iterator<Student> itr1 = l.iterator();
			while(itr1.hasNext())
			{
				Student stu = itr1.next();
				System.out.println(stu.getRollno()+" "+stu.getName());
			}
		}
		
		
		System.out.println();
		
		for(String s1 : set)
		{
			System.out.println(s1);
			List<Student> l1 = eng.get(s1);
			for(Student stu: l1)
			{
				System.out.println(stu.getRollno()+" "+stu.getName());
			}
		}
	}
	
	
	public Map<String, List<Student>> m1()
	{
		Map<String, List<Student>> eng=new HashMap<>();
		List<Student> fe = new ArrayList<>();
		Student s = new Student();
		s.setRollno(11);
		s.setName("Jerry");
		
		Student s1 = new Student();
		s1.setRollno(10);
		s1.setName("John");
		fe.add(s);
		fe.add(s1);
		
		List<Student> se=new ArrayList<>();
		Student s2 = new Student();
		s2.setRollno(21);
		s2.setName("Tom");
		
		Student s3 = new Student();
		s3.setRollno(20);
		s3.setName("Kevin");
		se.add(s2);
		se.add(s3);
		
		eng.put("First Year",fe);
		eng.put("Second Year",se);
		return eng;
		
	}
}