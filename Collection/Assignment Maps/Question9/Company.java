import java.util.*;
public class Company
{
	public static void main(String args[])
	{
		Company c = new Company();
		Map<String,Map<Integer, Employee>> team = c.designation();
		
		Set<String> s1 = team.keySet();
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext())
		{
			String str1 = itr.next();
			Map<Integer, Employee> m1 = team.get(str1);
			System.out.println("----"+str1+"----");
			Set<Integer> s2 = m1.keySet();
			Iterator<Integer> itr2 = s2.iterator();
			
			while(itr2.hasNext())
			{
				int key = itr2.next();
				Employee emp = m1.get(key);
				System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getEsalary());
			}
		}
		
		System.out.println();
		for(String str: s1)
		{
			System.out.println("----"+str+"----");
			Map<Integer, Employee> m1 = team.get(str);
			Set<Integer> set = m1.keySet();
			for(int x : set)
			{
				Employee emp = m1.get(x);
				System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getEsalary());
			}
		}
		
		
	}
	
	public Map<String,Map<Integer, Employee>> designation()
	{
		Map<String,Map<Integer, Employee>> team = new HashMap<>();
		
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("Harry");
		e.setEsalary(150000);
		Employee e1=new Employee();
		e1.setEid(102);
		e1.setEname("Ron");
		e1.setEsalary(120000);
		
		Map<Integer, Employee> developer=new HashMap<>();
		developer.put(e.getEid(),e);
		developer.put(e1.getEid(),e1);
		
		Employee e2=new Employee();
		e2.setEid(201);
		e2.setEname("Hermoine");
		e2.setEsalary(200000);
		Employee e3=new Employee();
		e3.setEid(202);
		e3.setEname("Nevile");
		e3.setEsalary(100000);
		
		Map<Integer, Employee> tester=new HashMap<>();
		tester.put(e2.getEid(),e2);
		tester.put(e3.getEid(),e3);
		
		team.put("Developer", developer);
		team.put("Tester", tester);
		
		return team;
	}
}