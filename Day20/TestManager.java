public class TestManager
{
	public static void main(String args[])
	{
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		
		m1.setId(1);
		m1.setName("Aditya");
		m1.setSalary(1728.287);
		m1.setQualification("B.Tech");
		m1.setBranchName("Information Technology");
		
		m2.setId(2);
		m2.setName("Yash");
		m2.setSalary(876.287);
		m2.setQualification("B.Tech");
		m2.setBranchName("Computer Technology");
		
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		System.out.println(m1.getSalary());
		System.out.println(m1.getQualification());
		System.out.println(m1.getBranchName());
		
		System.out.println();
		
		System.out.println(m2.getId());
		System.out.println(m2.getName());
		System.out.println(m2.getSalary());
		System.out.println(m2.getQualification());
		System.out.println(m2.getBranchName());
	}
	
}