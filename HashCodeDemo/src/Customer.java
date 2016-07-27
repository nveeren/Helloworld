
public class Customer {

	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

	public int hashCode()
	{
		System.out.println("From hashCode "+name.hashCode());
		return name.hashCode();
	}
	
	public boolean equals(Object object)
	{
		System.out.println("From equals");
		Customer customer=(Customer)object;
		if(name.equals(customer.name))
		{
			return true;
		}
		
		return false;
		
	}
	
}
