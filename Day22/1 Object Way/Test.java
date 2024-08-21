public class Test
{
	public static void main(String args[])
	{
		Address adr = new Address();
		adr.cityname="Pune";
		adr.areaname="Warje";
		adr.pincode=442001;
		
		AccountHolder ahr = new AccountHolder();
		ahr.ahid=1;
		ahr.ahname="Aditya";
		ahr.ahmob=8888031890l;
		ahr.a=adr;
		
		Bank b = new Bank();
		b.bid=101;
		b.bname="Axis";
		b.bcontact=8668778806l;
		b.ah=ahr;
		
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