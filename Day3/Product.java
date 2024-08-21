public class Product
{
	public void productName()
	{
		System.out.println("Product name is Laptop");
	}

	public void productPrice()
	{
		System.out.println("Product price is Rs. 10000");
	}

	public void productBrand()
	{
		System.out.println("Product brand is Lenovo");
	}

	public static void main(String args[])
	{
		Product p = new Product();
		p.productName();
		p.productPrice();
		p.productBrand();	
	}
}