public class DataType
{
	byte b = 123;  //3 digits
	short s = 12345;  //5 digits
	int i = 1234567890;  //10 digits
	long l = 1234567890123456789l;  //19 digits
	float f = 1234567.89890f;  //7 digits before decimal, total 8 digits
	double d = 1234567.8901234567;  //7 digits before decimal, total 17 digits
	char c= 'c';
	boolean flag = true;

	public static void main(String args[])
	{
		DataType data = new DataType();
		System.out.println("Max value for byte   is  "+data.b);
		System.out.println("Max value for short  is  "+data.s);
		System.out.println("Max value for int    is  "+data.i);
		System.out.println("Max value for long   is  "+data.l);
		System.out.println("Max value for float  is  "+data.f);
		System.out.println("Max value for double is  "+data.d);
		System.out.println("Max value for char   is  "+data.c);
	}
}