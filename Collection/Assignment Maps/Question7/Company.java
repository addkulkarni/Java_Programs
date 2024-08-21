import java.util.*;
public class Company
{
	public static void main(String args[])
	{
		Company e = new Company();
		Map<Integer, Employee> team = e.designation();
		Set<Integer> s = team.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			int id = itr.next();
			Employee emp = team.get(id);
			System.out.println(id+" "+emp.getEname()+" "+emp.getEsalary());
		}
		System.out.println();
		
		for(int a:s)
		{
			Employee emp = team.get(a);
			System.out.println(a+" "+emp.getEname()+" "+emp.getEsalary());
		}
		
		
	}
	
	public Map<Integer, Employee> designation()
	{
		Map<Integer, Employee> team = new HashMap<>();
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Aditya");
		e.setEsalary(150000);
		Employee e1 = new Employee();
		e1.setEid(2);
		e1.setEname("Abhijeet");
		e1.setEsalary(100000);
		Employee e2 = new Employee();
		e2.setEid(3);
		e2.setEname("Shubham");
		e2.setEsalary(150000);
		team.put(e.getEid(), e);
		team.put(e1.getEid(), e1);
		team.put(e2.getEid(), e2);
		
		return team;
	}
}