public class Data
{
	public void displayValues(User u)
	{
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getAge());
		System.out.println(u.getGender());
	}
	
	public User setValues()
	{
		User u = new User();
		u.setId(11);
		u.setName("Aditya Kulkarni");
		u.setAge(10);
		u.setGender('M');
		return u;
	}
}