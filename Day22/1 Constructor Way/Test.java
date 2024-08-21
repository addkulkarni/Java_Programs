public class Test
{
	public static void main(String args[])
	{
		Address adr = new Address("Pune","Warje",442001);
		AccountHolder ahr = new AccountHolder(101,"Aditya",8668778806l,adr);
		Bank b = new Bank(1001,"Axis",8888031890l,ahr);
		
		System.out.println(b.bid);
		System.out.println(b.bname);
		System.out.println(b.bcontact);
		System.out.println(b.ah.ahid);
		System.out.println(b.ah.ahname);
		System.out.println(b.ah.ahmob);
		System.out.println(b.ah.a.cityname);
		System.out.println(b.ah.a.areaname);
		System.out.println(b.ah.a.pincode);
	}
}