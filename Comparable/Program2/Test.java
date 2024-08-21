import java.util.*;

public class Test
{
	public Set<Bank> setData()
	{
		Set<Bank> s = new TreeSet<>();
		
		Person p = new Person();
		p.setPname("Aditya");
		p.setPaddr("Wardha");
		p.setPmob(8888031890l);
		
		Account a = new Account();
		a.setAccno(123456);
		a.setAcctype("Saving");
		a.setP(p);
		
		Bank b = new Bank();
		b.setBname("Axis");
		b.setBranch("Hinjewadi005");
		b.setAddr("Blue Ridge");
		b.setAcc(a);
		
		//second person
		Person p1 = new Person();
		p1.setPname("Pawan");
		p1.setPaddr("Amravati");
		p1.setPmob(8668778806l);
		
		Account a1 = new Account();
		a1.setAccno(987654);
		a1.setAcctype("Current");
		a1.setP(p);
		
		Bank b1 = new Bank();
		b1.setBname("ICICI");
		b1.setBranch("Hinjewadi");
		b1.setAddr("Megapolis");
		b1.setAcc(a);
		
		s.add(b);
		s.add(b1);

		return s;
	}
	
	public void getDetails()
	{
		Test t = new Test();
		Set<Bank> s = t.setData();
		for(Bank a:s)
		{
			System.out.println(a.getBname());
			System.out.println(a.getBranch());
			System.out.println(a.getAddr());
			System.out.println(a.getAcc().getAccno());
			System.out.println(a.getAcc().getAcctype());
			System.out.println(a.getAcc().getP().getPname());
			System.out.println(a.getAcc().getP().getPaddr());
			System.out.println(a.getAcc().getP().getPmob());
		}
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		
		t.getDetails();
	}
}




