import java.util.*;
public class College
{
	public static void main(String args[])
	{
		College c = new College();
		Map<Integer, Student> eng = c.m1();
		
		Set<Integer> set = eng.keySet();
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
		{
			int key = itr.next();
			Student stu = eng.get(key);
			System.out.println(key+" "+stu.getName());
		
		}
		
		
		System.out.println();
		
		for(Integer s1 : set)
		{
			
			Student stu = eng.get(s1);
			System.out.println(stu.getRollno()+" "+stu.getName());	
		}
	}
	
	
	public Map<Integer, Student> m1()
	{
		Map<Integer, Student> eng=new HashMap<>();
		
		Student s = new Student();
		s.setRollno(11);
		s.setName("Jerry");
		
		Student s1 = new Student();
		s1.setRollno(10);
		s1.setName("John");
		
		Student s2 = new Student();
		s2.setRollno(21);
		s2.setName("Tom");
		
		Student s3 = new Student();
		s3.setRollno(20);
		s3.setName("Kevin");
		
		
		eng.put(s.getRollno(),s);
		eng.put(s1.getRollno(),s1);
		eng.put(s2.getRollno(),s2);
		eng.put(s3.getRollno(),s3);
		return eng;
		
	}
}