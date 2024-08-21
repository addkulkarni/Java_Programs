public class TestPatient
{
	public static void main(String args[])
	{
		Patient p1 = new Patient();
		Patient p2 = new Patient();
		
		p1.setId(1);
		p1.setName("Aditya");
		p1.setAddress("Pune");
		p1.setMobno(8888031890l);
		p1.setDisease("Fever");
		
		p2.setId(2);
		p2.setName("Yash");
		p2.setAddress("Mumbai");
		p2.setMobno(8668778806l);
		p2.setDisease("Cough");
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		System.out.println(p1.getMobno());
		System.out.println(p1.getDisease());
		
		System.out.println();
		
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAddress());
		System.out.println(p2.getMobno());
		System.out.println(p2.getDisease());
	}
}