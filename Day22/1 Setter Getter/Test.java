public class Test
{
	public static void main(String args[])
	{
		Address adr = new Address();
		adr.setCityname("Pune");
		adr.setAreaname("Warje");
		adr.setPincode(442001);
		
		AccountHolder ahl = new AccountHolder();
		ahl.setAhid(6);
		ahl.setAhname("Yash");
		ahl.setAhmob(8668778806l);
		ahl.setA(adr);
		
		Bank ba = new Bank();
		ba.setBid(1);
		ba.setBname("Aditya");
		ba.setBcontact(8888031890l);
		ba.setAh(ahl);
		
		System.out.println(ba.getBid());
		System.out.println(ba.getBname());
		System.out.println(ba.getBcontact());
		System.out.println(ba.getAh().getAhid());
		System.out.println(ba.getAh().getAhname());
		System.out.println(ba.getAh().getAhmob());
		System.out.println(ba.getAh().getA().getCityname());
		System.out.println(ba.getAh().getA().getAreaname());
		System.out.println(ba.getAh().getA().getPincode());
		
	}
}