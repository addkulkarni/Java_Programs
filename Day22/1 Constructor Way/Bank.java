public class Bank
{
	int bid;
	String bname;
	long bcontact;
	AccountHolder ah;
	
	public Bank(int bid, String bname, long bcontact, AccountHolder ah)
	{
		this.bid=bid;
		this.bname=bname;
		this.bcontact=bcontact;
		this.ah=ah;
	}
}