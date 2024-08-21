public class TestPerson
{
	public static void main(String args[])
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setId(1);
		p1.setName("Aditya");
		p1.setAddress("Pune");
		p1.setAge(29);
		p1.setWeight(80);
		p1.setHeight(175);
		p1.setMobno(8888083890l);
		p1.setProfession("teacher");
		
		p2.setId(2);
		p2.setName("Yash");
		p2.setAddress("Pune");
		p2.setAge(35);
		p2.setWeight(89);
		p2.setHeight(179);
		p2.setMobno(8668877789l);
		p2.setProfession("Teacher");
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		System.out.println(p1.getAge());
		System.out.println(p1.getWeight());
		System.out.println(p1.getHeight());
		System.out.println(p1.getMobno());
		System.out.println(p1.getProfession());
		
		System.out.println();
		
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAddress());
		System.out.println(p2.getAge());
		System.out.println(p2.getWeight());
		System.out.println(p2.getHeight());
		System.out.println(p2.getMobno());
		System.out.println(p2.getProfession());
	
		
	}
}