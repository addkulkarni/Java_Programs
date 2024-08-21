public class Hospital
{
	public void patientDetails(int h_id, String h_name,String h_address,long mob_no)
	{
		System.out.println(h_id+" "+h_name+" "+h_address+" "+mob_no);
		Patient p = new Patient();
		p.p_id = 12;
		p.p_name="ABC";
	 	p.p_mob_no=9857486745l;
		p.p_address="Wardha";
	 	p.p_adhaar_no=285747983847l;
		System.out.println(p.p_id+" "+p.p_name+" "+p.p_mob_no+" "+p.p_address+" "+p.p_adhaar_no);
	}
}