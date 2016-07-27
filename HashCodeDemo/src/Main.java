import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
	HashSet<Customer> customers=new HashSet<>();
	Customer customer1 = new Customer("AB");
	Customer customer2 =customer1;
	
	customers.add(customer1);
	customers.add(customer2);
	
System.out.println(customers);
	}

}
